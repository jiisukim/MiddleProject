package campingCrew.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewActVO;
import vo.CrewThmVO;
import vo.RecCrewVO;
import vo.RecCrewVO2;

public class CampingCrewJoin implements CommandHandler{
	private static String VIEW_PAGE = "/WEB-INF/views/crew/crewJoinGender.jsp";
	private ICampingCrewService campCrewService = CampingCrewServiceImpl.getInstance();
	
	private String key = "";
	String gen = "";
	String act = "";
	String thm = "";
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getParameter("key") != null) {
			key = req.getParameter("key");
			
			
			if("gender".equalsIgnoreCase(key)) {
				gen= new String(req.getParameter("gen").getBytes("ISO-8859-1"), "UTF-8");
				VIEW_PAGE = "/WEB-INF/views/crew/crewJoinAct.jsp?gen="+gen;
			}else if("act".equalsIgnoreCase(key)){
				act= new String(req.getParameter("act").getBytes("ISO-8859-1"), "UTF-8");
				VIEW_PAGE = "/WEB-INF/views/crew/crewJoinThm.jsp?gen="+gen+"&act="+act;
			}else if("thm".equalsIgnoreCase(key)) {
				thm= new String(req.getParameter("thm").getBytes("ISO-8859-1"), "UTF-8");
				VIEW_PAGE = "/WEB-INF/views/crew/crewSearch.jsp?gen="+gen+"&act="+act+"&thm="+thm;
				
				
				CrewActVO cav = new CrewActVO();
				if("등산".equals(act)) {
					cav.setActCode("a001");
				}else if("낚시".equals(act)){
					cav.setActCode("a002");
				}else if("오락".equals(act)){
					cav.setActCode("a003");
				}else if("힐링".equals(act)){
					cav.setActCode("a004");
				}else if("무관".equals(act)){
					cav.setActCode("");
				}
				
				CrewThmVO ctv = new CrewThmVO();
				if("해안".equals(thm)) {
					ctv.setTmCode("t001");
				}else if("자연".equals(thm)){
					ctv.setTmCode("t002");
				}else if("도시".equals(thm)){
					ctv.setTmCode("t003");
				}else if("반려동물".equals(thm)){
					ctv.setTmCode("t004");
				}else if("무관".equals(thm)){
					ctv.setTmCode("");
				}
				
				if("무관".equalsIgnoreCase(gen)) {
					gen = "";
				}
				
				String actCode = cav.getActCode();
				String tmCode = ctv.getTmCode();
				String recrGender = gen;
				
				System.out.println("actCode>>>" + actCode);
				System.out.println("tmCode>>>" + tmCode);
				System.out.println("recrGender>>>" + recrGender);
				
				
				RecCrewVO2 rcv = new RecCrewVO2();
				rcv.setActCode(actCode);
				rcv.setTmCode(tmCode);	
				rcv.setRecrGender(recrGender);
				
				List<RecCrewVO2> rv = campCrewService.checkCrewCtgr(rcv);
				for(int i = 0; i< rv.size(); i++) {
					System.out.println("dd>>>" + rv.get(i).getActCode());
					System.out.println("dd>>>" + rv.get(i).getRecrContent());
					
				}
				
				System.out.println();
				req.setAttribute("rv", rv);
			
			}else {
				VIEW_PAGE = "/WEB-INF/views/crew/crewJoinGender.jsp";
			}
			
			
			
		}else if(req.getParameter("key") == null) {
			VIEW_PAGE = "/WEB-INF/views/crew/crewJoinGender.jsp";
		}
		return VIEW_PAGE;
	}

}
