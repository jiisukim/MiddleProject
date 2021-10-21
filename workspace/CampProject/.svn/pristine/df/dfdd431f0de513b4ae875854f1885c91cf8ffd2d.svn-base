package login.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import login.service.AdminLoginServiceImpl;
import login.service.HostServiceImpl;
import login.service.IAdminLoginService;
import login.service.IHostLoginService;
import login.service.IUserLoginService;
import login.service.UserLoginServiceImpl;
import vo.AdminVO;
import vo.CampHostVO;
import vo.ConstVO;

public class AdminLoginHandler implements CommandHandler{
	
	private static final Logger LOGGER = Logger.getLogger(AdminLoginHandler.class);
	IAdminLoginService hostjoinService = AdminLoginServiceImpl.getInstance();

	public boolean isRedirect(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String url = "";
		
		if(req.getMethod().equalsIgnoreCase("GET")){
			url = ConstVO.VIEW_LOGIN;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")){
			String adminID = req.getParameter("adminID");
			String adminPW = req.getParameter("adminPW");
			
			System.out.println("adminID : " + adminID);
			System.out.println("adminPW : " + adminPW);
			
			IAdminLoginService serv = AdminLoginServiceImpl.getInstance();
			
			AdminVO adminVO = serv.checkAdmin(adminID, adminPW);
			
			
			int cnt = 0;
			if(adminVO != null) { // 로그인 성공
				
				req.setAttribute("vo", adminVO);
				
				//세션에 로그인 된 아이디에 대한 회원 정보 넣기
				HttpSession session = req.getSession(true);
				session.setAttribute("adminVO", adminVO);
				
				session.setAttribute(ConstVO.LOGIN_TYPE, ConstVO.LOGIN_TYPE_ADMIN);
				
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