package comm.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import comm.handler.NullHandler;


/**
 * 사용자의 요청을 받아서 처리하는 대표 컨트롤러 구현하기
 * @author PC-07
 *
 */
public class WebController extends HttpServlet{
	
	private static Logger logger = Logger.getLogger(WebController.class);
	
	//매핑정보 저장(키 : 요청url , value : 핸들러객체 )
	private Map<String, CommandHandler> cmmHandlerMap = new HashMap<String, CommandHandler>();
	
	
	/**
	 * 설정 파일을 참고하여 요청 uri별 대응되는 핸들러 객체를 생성하여 맵에 등록한다.
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		//설정파일 경로 정보 가져오기
		String configFilePath = config.getInitParameter("handler-config");
		
		Properties prop = new Properties();
		FileReader fr;
		try {
			fr = new FileReader(config.getServletContext().getRealPath(configFilePath));
			
			prop.load(fr);
			
			fr.close();
		}catch(IOException e) {
			e.printStackTrace();			
			throw new ServletException(e);
		}
		
		for( Object key :prop.keySet()) {
			
			String reqURL = (String)key;
			
			try {
				Class<?> klass = Class.forName(prop.getProperty(reqURL));
				
				CommandHandler handler = (CommandHandler) klass.newInstance();

				cmmHandlerMap.put(reqURL, handler);
			}catch(Exception e) {
				e.printStackTrace();
				throw new ServletException();
			}
			
		}
		
		
		//등록된 전체 헨들러 정보 조회하기
		Set<Map.Entry<String, CommandHandler>> entrySet = cmmHandlerMap.entrySet();
		for( Entry<String, CommandHandler> entry : entrySet ) {
			logger.info(entry.getKey() + " : " + entry.getValue());
		}
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);		
	}

	/**
	 * 요청처리 메서드
	 * @param req
	 * @param resp
	 * @throws IOException 
	 */
		
	private void process(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
				
		
		String reqURI = req.getRequestURI();		
		
		if(reqURI.indexOf(req.getContextPath())== 0){
			reqURI = reqURI.substring(req.getContextPath().length());
		}
		
		CommandHandler handler = cmmHandlerMap.get(reqURI);
		
		if(handler == null) {
			handler = new NullHandler();
		}
		
		
		if(logger.isInfoEnabled()) {
			logger.info("요청 URL : " + reqURI);
			logger.info("핸들러객체 : " + handler);
		}
		
		String viewPage = ""; //뷰화면 정보 (URL)
		try {
			viewPage = handler.process(req, resp); //핸들러 처리
		}catch(Throwable e) {
			e.printStackTrace();
			throw new ServletException();
		}
		
		logger.info("viewPage 정보 : " + viewPage);
		
		//view 화면 처리하기
		if(viewPage != null) {// 뷰페이지가 존재하면
			if(handler.isRedirect(req)) { //리다이렉트 처리가 필요하다면
				resp.sendRedirect(viewPage);
			}else {
				RequestDispatcher dispatcher = req.getRequestDispatcher(viewPage);
				dispatcher.forward(req, resp);
			}
			
		}
		
	}
}
