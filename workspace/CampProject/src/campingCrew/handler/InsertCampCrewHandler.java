package campingCrew.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import campingCrew.service.CampingCrewServiceImpl;
import campingCrew.service.ICampingCrewService;
import comm.handler.CommandHandler;
import vo.CrewActVO;
import vo.CrewThmVO;
import vo.RecCrewVO;

public class InsertCampCrewHandler implements CommandHandler{
	private static final Logger LOGGER = Logger.getLogger(InsertCampCrewHandler.class);
	
	private static final String VIEW_PAGE = "/WEB-INF/views/crew/crewMake.jsp";
	
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
		if(req.getMethod().equals("GET")) {
			return VIEW_PAGE;
		}else if(req.getMethod().equals("POST")) {
			//1. 요청 파라미터 정보가져오기
			//1. insertCrewMake
			String memCode = req.getParameter("memCode"); 
			String recrGender = req.getParameter("recrGender");
			String recrStart = req.getParameter("recrStart");
			String recrEnd = req.getParameter("recrEnd");
			int recrNeednum = Integer.parseInt(req.getParameter("recrNeednum"));
			String recrTitle = req.getParameter("recrTitle");
			String recrContent = req.getParameter("recrContent");
			
			RecCrewVO rv = new RecCrewVO();
			
			rv.setMemCode(memCode);
			rv.setRecrGender(recrGender);
			rv.setRecrStart(recrStart);
			rv.setRecrEnd(recrEnd);
			rv.setRecrNeednum(recrNeednum);
			rv.setRecrTitle(recrTitle);
			rv.setRecrContent(recrContent);
			
			int cnt = campCrewSerivce.insertCrewMake(rv);	
			
			//2.insertCrewMakeAct
			String actCode = req.getParameter("actCode");
			if("등산".equals(actCode)) {
				actCode = "a001";
			}else if("낚시".equals(actCode)) {
				actCode = "a002";
			}else if("오락".equals(actCode)) {
				actCode = "a003";
			}else if("힐링".equals(actCode)) {
				actCode = "a004";
			}else if("무관".equals(actCode)) {
				actCode = "a005";
			}
			
			
			CrewActVO cav = new CrewActVO();
			
			cav.setActCode(actCode);
			
			cnt += campCrewSerivce.insertCrewMakeAct(cav);	
			
			//3.insertCrewMakeThm
			String tmCode = req.getParameter("tmCode");
			if("해안".equals(tmCode)) {
				tmCode = "t001";
			}else if("자연".equals(tmCode)) {
				tmCode = "t002";
			}else if("도시".equals(tmCode)) {
				tmCode = "t003";
			}else if("반려동물".equals(tmCode)) {
				tmCode = "t004";
			}else if("무관".equals(tmCode)) {
				tmCode = "t005";
			}
			
			
			CrewThmVO ctv = new CrewThmVO();
			
			ctv.setTmCode(tmCode);
			
			cnt += campCrewSerivce.insertCrewMakeThm(ctv);	
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			// xml에 전송 끝  //
			
			
			/////////////////////////////////////////////////////////////////
			String redirectURL = req.getContextPath() +"/crew/crewView.do?msg="+ URLEncoder.encode(msg,"utf-8");
			//select.do?ntcCode=<%=noticeList.get(i).getNtcCode()
			return redirectURL;		//돌아갈 URL
			
			
		}
		return null;
	}

}
