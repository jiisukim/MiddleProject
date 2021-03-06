package campingCrew.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewActVO;
import vo.CrewThmVO;
import vo.NoticeVO;
import vo.RecCrewVO;

// 크루 만들 때 만들기 버튼 누르면 자기가 만든 크루모집 게시글 상세정보 보이는거

public class ViewCampCrewHandler implements CommandHandler{

	private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewView.jsp";
	
	private ICampingCrewService campCrewService = CampingCrewServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 1. 전체 조회
		String crewCode = String.valueOf(campCrewService.maxCrewCode());
		
		RecCrewVO rv = campCrewService.getCrew(crewCode);
		
		req.setAttribute("rv", rv);
		
		// 2. 활동 조회
		CrewActVO cav = campCrewService.getCrewAct(crewCode);
		String cavAct = cav.getActCode();
		if("a001".equals(cavAct)) {
			cav.setActCode("등산");
		}else if("a002".equals(cavAct)){
			cav.setActCode("낚시");
		}else if("a003".equals(cavAct)){
			cav.setActCode("오락");
		}else if("a004".equals(cavAct)){
			cav.setActCode("힐링");
		}else if("a005".equals(cavAct)){
			cav.setActCode("무관");
		}
		
		req.setAttribute("cav", cav);
		System.out.println(cav.getActCode());
		
		// 3. 테마 조회
		CrewThmVO ctv = campCrewService.getCrewThm(crewCode);
		String ctvTm = ctv.getTmCode();
		if("t001".equals(ctvTm)) {
			ctv.setTmCode("해안");
		}else if("t002".equals(ctvTm)){
			ctv.setTmCode("자연");
		}else if("t003".equals(ctvTm)){
			ctv.setTmCode("도시");
		}else if("t004".equals(ctvTm)){
			ctv.setTmCode("반려동물");
		}else if("t005".equals(ctvTm)){
			ctv.setTmCode("무관");
		}
		
		
		req.setAttribute("ctv", ctv);
		
		return VIEW_PAGE;
	}

}
