package pay;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import pay.service.IPayService;
import pay.service.PayServiceImpl;
import vo.CampBookVO;
import vo.CampHostVO;
import vo.ConstVO;

public class ChoosePayHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(ChoosePayHandler.class);
	private IPayService payService = PayServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";
		if(req.getMethod().equalsIgnoreCase("GET")) {
			//req에서 해당 캠핑코드를 받아내서 db상에서 비용과 수용인원을 뽑아낸다
			String cmpCode= req.getParameter("cmpCode");
			
			CampHostVO camphost = payService.searchCampHost(cmpCode);
			//req에 정보담아서 보내기				
			
			req.setAttribute("camphost", camphost);
			
			url = ConstVO.VIEW_CLIENT_BOOKING;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			String cmpCode = req.getParameter("cmpCode");
			int bkMemnum = Integer.parseInt(req.getParameter("bkMemnum"));
			String bkDayin = req.getParameter("bkDayin");
			String bkDayout = req.getParameter("bkDayout");
			String bkPrice = req.getParameter("bkPrice");
			String memNick = req.getParameter("memNick");
			String memName = req.getParameter("memName");
			String memCode = req.getParameter("memCode");
			
			CampBookVO campbook = new CampBookVO();
			
			campbook.setCmpCode(cmpCode);
			campbook.setBkMemnum(bkMemnum);
			campbook.setBkDayin(bkDayin);
			campbook.setBkDayout(bkDayout);
			campbook.setBkPrice(bkPrice);
			campbook.setMemCode(memCode);
			
			//예약테이블에 삽입하기
			int cnt = payService.insertCampbook(campbook); //bkcode입력됨
			if(cnt != 1) {
				System.out.println("데이터 입력중 오류발생");
			}
			
			req.setAttribute("campbook", campbook);
			
			url = ConstVO.VIEW_CLIENT_RECEIPT;
			
		}
		
		
		return url;
	}

}
