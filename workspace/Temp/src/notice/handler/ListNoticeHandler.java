package notice.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;
import vo.PagingVO;

public class ListNoticeHandler implements CommandHandler{

	private static final String VIEW_PAGE = "/WEB-INF/views/host/hostNotice.jsp";
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		//1. 요청 페이지 번호 가져오기
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
		
		PagingVO pagingVO = new PagingVO();
		
		int totalCnt = noticeService.getTotalCnt();
		
		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(10);
		pagingVO.setPageSize(5);
		
		List<NoticeVO> noticeList = noticeService.getNoticeAll(pagingVO);
		
		req.setAttribute("noticeList", noticeList);
		req.setAttribute("pagingVO", pagingVO);
		
		return VIEW_PAGE;
	}

}
