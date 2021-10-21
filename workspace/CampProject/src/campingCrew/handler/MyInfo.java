package campingCrew.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.MemVO;
import vo.NoticeVO;

public class MyInfo implements CommandHandler{
	private static final String  VIEW_PAGE = "/WEB-INF/views/myPageUser/userInfo.jsp";
	
	private ICampingCrewService campCrewSerivce = CampingCrewServiceImpl.getInstance();
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String memCode = req.getParameter("memCode");
		
		MemVO mvo = campCrewSerivce.myInfoSel(memCode);
		
		req.setAttribute("mvo", mvo);
		return VIEW_PAGE;
	}

}
