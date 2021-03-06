package campingCrew.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.MemVO;
import vo.RecCrewVO2;

//마이페이지에서 보이는 크루
public class MyPageCrew implements CommandHandler{
	private static final String VIEW_PAGE = "/WEB-INF/views/crew/myCrew.jsp";
	private ICampingCrewService campCrewService = CampingCrewServiceImpl.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {

		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String memCode = req.getParameter("memCode");
		System.out.println("memCode>>>" + memCode);
		MemVO mv =  campCrewService.getUserIdByMemCode(memCode);
		System.out.println("mv>>>" + mv);
		
		req.setAttribute("mv", mv);
		
		RecCrewVO2 rcv = new RecCrewVO2();
		rcv.setMemCode(memCode);
	
		List<RecCrewVO2> rv = campCrewService.crewInfoMemCode(rcv);
		req.setAttribute("rv", rv);
		
		return VIEW_PAGE;
	}

}
