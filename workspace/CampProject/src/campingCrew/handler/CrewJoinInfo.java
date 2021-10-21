package campingCrew.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.RecCrewVO2;
// 카테고리 검색으로 나온 크루 게시글 클릭 했을 때 출력하기 위한 클래스
public class CrewJoinInfo implements CommandHandler{
	private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewView2.jsp";
	
	private ICampingCrewService campCrewService = CampingCrewServiceImpl.getInstance();
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String crewCode = req.getParameter("crewCode"); 
		
		RecCrewVO2 rv =  campCrewService.crewInfo(crewCode);
		req.setAttribute("rv", rv);
		
		return VIEW_PAGE;
	}

}
