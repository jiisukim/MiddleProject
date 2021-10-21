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

public class LogoutHandler implements CommandHandler{
	
	private static final Logger LOGGER = Logger.getLogger(UserLoginHandler.class);
	IUserLoginService hostjoinService = UserLoginServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = ConstVO.VIEW_LOGIN;
		
		if(req.getMethod().equalsIgnoreCase("GET")){
			//로그아웃
			req.getSession().invalidate();
			
		}
		return url;
	}
}
