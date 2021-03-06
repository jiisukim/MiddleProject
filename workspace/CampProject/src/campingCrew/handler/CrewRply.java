package campingCrew.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewreplyVO;

public class CrewRply implements CommandHandler{
	private static final Logger LOGGER = Logger.getLogger(InsertCampCrewHandler.class);
	
	private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewView3.jsp";
	
	private ICampingCrewService campCrewSerivce = CampingCrewServiceImpl.getInstance();

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
		
			String replyCon = req.getParameter("replyCon"); 
			String crewCode = req.getParameter("crewCode");
			String memId = req.getParameter("memId");
			String memCode = req.getParameter("memCode");
		
			
			
			CrewreplyVO crv = new CrewreplyVO();
			crv.setReplyCon(replyCon);
			crv.setCrewCode(crewCode);
			crv.setMemId(memId);
			crv.setMemCode(memCode);
			
			int cnt = campCrewSerivce.insertRply(crv);	 	
			String redirectURL = req.getContextPath() +"/crew/crewViewthr.do?crewCode="+crewCode;
			return redirectURL;		//돌아갈 URL
			
		
	}
}
