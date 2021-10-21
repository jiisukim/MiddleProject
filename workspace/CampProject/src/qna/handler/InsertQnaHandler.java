package qna.handler;

import java.net.URLEncoder;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import comm.service.AtchfileServiceImpl;
import comm.service.IatchFileService;
import event.handler.InsertEventHandler;
import event.service.EventServiceImpl;
import event.service.IEventService;
import filter.FileUploadRequestWrapper;
import qna.service.IQnaService;
import qna.service.QnaServiceImpl;
import vo.AtFileVO;
import vo.EventVO;
import vo.MemVO;
import vo.QnaVO;

public class InsertQnaHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(InsertQnaHandler.class); 
	
	private static final String VIEW_PAGE = "/WEB-INF/views/qna/insert.jsp";
	
	private IQnaService qnaService = QnaServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		
		if(req.getMethod().equals("GET")) {
			return false; // forward
		}else if(req.getMethod().equals("POST")) {
			return true; // redirect
		}
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		if(req.getMethod().equals("GET")) {
			return VIEW_PAGE;
		}else if(req.getMethod().equals("POST")) {
			
			HttpSession session = req.getSession(false);
			MemVO memVO = (MemVO) session.getAttribute("memVO");
			
			// 1.요청 파라미터정보 가져오기
//			String qnaCode = req.getParameter("qnaCode"); // 코드는 자동생성인데..
//			String memCode = req.getParameter("memCode"); //여기도 입력은 안했는디
			String qnaTitle = req.getParameter("qnaTitle");
			String qnaCon = req.getParameter("qnaCon");
//			String qnaDate = req.getParameter("qnaDate"); //현재시간을....?
			
			
//			VO세팅
			QnaVO qnaVO = new QnaVO();
//			qnaVO.setQnaMemCode();여기서 세션객체에서 가져온다는건가??
			String memCode = memVO.getMemCode();
			String memNick = memVO.getMemNick();
			
			qnaVO.setQnaCode(memCode);
			qnaVO.setQnaTitle(qnaTitle);
			qnaVO.setQnaCon(qnaCon);
			qnaVO.setMemNick(memNick);
			
			
//			cnt값
			int cnt = qnaService.insertQna(qnaVO); 
			
//			String memNick = qnaService.getMemNick(qnaVO);
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			
	
			String redirectURL = req.getContextPath() 
					+ "/qna/list.do?msg=" + URLEncoder.encode(msg, "utf-8");
			return redirectURL;
				
		}
		
		return null;
		
	}
	
	
	
}
