package mamManage.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import mamManage.service.IMemManagerService;
import mamManage.service.MemManagerServiceImpl;
import vo.CampHostVO;
import vo.MemVO;
import vo.NoticeVO;
import vo.PagingVO;

public class ListMemManagerHandler implements CommandHandler{
	
	private static final String VIEW_PAGE = "/WEB-INF/views/client/memManagerList.jsp"; // /WEB-INF/views/member/list.jsp
	
	private IMemManagerService memManageService = MemManagerServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 1. 요청 페이지 번호 가져오기
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));

		PagingVO pagingVO = new PagingVO();

		int totalCnt = memManageService.getTotalCnt();

		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(5);
		pagingVO.setPageSize(5);

		// 2. 회원정보 조회
		List<MemVO> memList = memManageService.getAllMemberList(pagingVO);

		req.setAttribute("memList", memList);
		req.setAttribute("pagingVO", pagingVO);

		return VIEW_PAGE;
	}
	

}
