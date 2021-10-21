package campingCrew.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewreplyVO;
import vo.NoticeVO;
import vo.PagingVO;
import vo.RecCrewVO2;

public class CrewJoinInfo2 implements CommandHandler{
private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewView3.jsp";
	
	private ICampingCrewService campCrewService = CampingCrewServiceImpl.getInstance();
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String crewCode = req.getParameter("crewCode"); 
		// 크루정보 조회
		RecCrewVO2 rv =  campCrewService.crewInfo(crewCode);
		req.setAttribute("rv", rv);
		
		// 댓글조회
		
		List<CrewreplyVO> crv = campCrewService.crewRplyChk(crewCode);
		req.setAttribute("crv", crv);
		
		return VIEW_PAGE;
	}
}
