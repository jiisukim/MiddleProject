package campMangage.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import campMangage.service.CampManagerServiceImpl;
import campMangage.service.ICampManagerService;
import comm.handler.CommandHandler;
import join.HostJoinHandler;
import vo.CampHostVO;

public class UpdateCampManagerHandler implements CommandHandler {
	private static final String VIEW_PAGE = ""; // /WEB-INF/views/member/updateForm.jsp

	private static final Logger LOGGER = Logger.getLogger(HostJoinHandler.class); 
	
	private ICampManagerService campManageService = CampManagerServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return false; // forward
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return true; // redirect
		}
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if (req.getMethod().equalsIgnoreCase("GET")) {

			String campId = req.getParameter("campId");

			// 1. 회원정보 조회
			CampHostVO campVO = campManageService.getCamping(campId);

			// 3. request객체에 회원정보 저장
			req.setAttribute("campVO", campVO);

			return VIEW_PAGE;

		} else if (req.getMethod().equalsIgnoreCase("POST")) {

			

			// 1. 요청파라미터 정보 가져오기
			String campId = req.getParameter("campId");
			String cmpAppyn = req.getParameter("cmpAppyn");

			CampHostVO cv = new CampHostVO();
			cv.setCmpId(campId);
			cv.setCmpAppyn(cmpAppyn);

			// 3. 회원정보 수정하기
			int cnt = campManageService.updateCamping(cv);

			String msg = "";
			if (cnt > 0) {
				msg = "성공";
			} else {
				msg = "실패";
			}

			String redirecURL = req.getContextPath() + "/member/list.do?msg=" + URLEncoder.encode(msg, "utf-8");

			return redirecURL;
		}

		return null;
	}
	
}
