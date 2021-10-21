package campingCrud.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campingCrud.service.CampingServiceImpl;
import campingCrud.service.ICampingService;
import comm.handler.CommandHandler;
import vo.CampHostVO;

public class ListCampingHandler implements CommandHandler {

	private static final String VIEW_PAGE = "/WEB-INF/views/host/camping_detail.jsp";

	private ICampingService campingService = CampingServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {

		return false; // 포워드       true: 리다이렉트
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String cmpId = "camp1";//req.getParameter("cmpId");
		// 2. 회원정보 조회
		CampHostVO campingVo = campingService.getCamping(cmpId);

		req.setAttribute("campingVo", campingVo);

		return VIEW_PAGE;
	}
}
