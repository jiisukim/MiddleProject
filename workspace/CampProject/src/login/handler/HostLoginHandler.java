package login.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import login.service.HostServiceImpl;
import login.service.IHostLoginService;
import login.service.IUserLoginService;
import login.service.UserLoginServiceImpl;
import vo.CampHostVO;
import vo.ConstVO;
import vo.MemVO;

public class HostLoginHandler implements CommandHandler{
	
	private static final Logger LOGGER = Logger.getLogger(HostLoginHandler.class);
	IHostLoginService hostjoinService = HostServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";
		
		if(req.getMethod().equalsIgnoreCase("GET")){
			url = ConstVO.VIEW_LOGIN;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")){
			String hostID = req.getParameter("hostID");
			String hostPW = req.getParameter("hostPW");
			
			System.out.println("hostId : " + hostID);
			System.out.println("hostPW : " + hostPW);
			
			IHostLoginService serv = HostServiceImpl.getInstance();
			
			CampHostVO hostVO = serv.checkHost(hostID, hostPW);
			
			
			int cnt = 0;
			if(hostVO != null) { // 로그인 성공
				
				req.setAttribute("vo", hostVO);
				
				//세션에 로그인 된 아이디에 대한 회원 정보 넣기
				HttpSession session = req.getSession(true);
				session.setAttribute("hostVO", hostVO);
				
				session.setAttribute(ConstVO.LOGIN_TYPE, ConstVO.LOGIN_TYPE_HOST);
				
				cnt = 1;
				req.setAttribute("isSuccess", cnt);
				
				url = ConstVO.CHECK_VERIFY;
				
			} else { // 로그인 실패
				
				req.setAttribute("isSuccess", cnt);
				
				url = ConstVO.CHECK_VERIFY;
				
			}
			
		}
		return url;
	}
}
