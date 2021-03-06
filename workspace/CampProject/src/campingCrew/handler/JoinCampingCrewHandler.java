package campingCrew.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewVO;
import vo.RecCrewVO;


// 카테고리별로 분류해서 나온 게시글에서 신청하기 눌렀을때 TB_CREW테이블에 insert하는 핸들러 
public class JoinCampingCrewHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(JoinCampingCrewHandler.class);
	
	private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewView2.jsp";
	
	private ICampingCrewService camCrewService = CampingCrewServiceImpl.getInstance();
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equals("GET")) {
			return false; // forward
		}else if(req.getMethod().equals("POST")) {
			return true; // redirect
		}
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equals("GET")) {
			return VIEW_PAGE;
		}else if(req.getMethod().equals("POST")) {
			String crewCode = req.getParameter("crewCode");
			String memCode = req.getParameter("memCode");
			
			CrewVO cv = new CrewVO();
			cv.setCrewCode(crewCode);
			cv.setMemCode(memCode);
			
			int cnt = camCrewService.insertCrewMember(cv);
			
			RecCrewVO rv = new RecCrewVO();
			rv.setCrewCode(crewCode);
			
			cnt += camCrewService.updateCrew(rv);
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			String redirectURL = "/";
			
			return redirectURL;
			
		}
		
		return null;
	}

}
