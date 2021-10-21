package adminCrud.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import adminCrud.service.AdminService;
import adminCrud.service.IAdminService;
import comm.handler.CommandHandler;
import vo.MemVO;
import vo.PagingVO;

public class ListAdminHandler implements CommandHandler {
	
	private static final String VIEW_PAGE = "/WEB-INF/views/admin/adminList.jsp";

	private IAdminService memService = AdminService.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {

		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		// 1. 요청 페이지 번호 가져오기
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));

		PagingVO pagingVO = new PagingVO();

		int totalCnt = memService.getTotalCnt();

		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(5);
		pagingVO.setPageSize(5);
		
		List<MemVO> memList = memService.getMemAll(pagingVO);
		
		req.setAttribute("memList", memList);
		req.setAttribute("pagingVO", pagingVO);
		
		return VIEW_PAGE;
	}

}
