package login.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import login.service.IUserLoginService;
import login.service.UserLoginServiceImpl;
import vo.ConstVO;
import vo.MemVO;

public class UserLoginHandler implements CommandHandler {
	
	private static final Logger LOGGER = Logger.getLogger(UserLoginHandler.class);

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
			String memID = req.getParameter("userID");
			String memPW = req.getParameter("userPW");
			
			IUserLoginService serv = UserLoginServiceImpl.getInstance();
			
			MemVO memVO = serv.checkUser(memID, memPW);
			
			
			int cnt = 0;
			if(memVO != null) { // 로그인 성공
				
				req.setAttribute("vo", memVO);
				
				//세션에 로그인 된 아이디에 대한 회원 정보 넣기
				HttpSession session = req.getSession(true);
				session.setAttribute("memVO", memVO);
				
				session.setAttribute(ConstVO.LOGIN_TYPE, ConstVO.LOGIN_TYPE_USER);
				
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
