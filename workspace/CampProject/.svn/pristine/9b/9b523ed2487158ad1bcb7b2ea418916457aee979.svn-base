package qna.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import qna.service.IQnaService;
import qna.service.QnaServiceImpl;
import vo.PagingVO;
import vo.QnaVO;

public class ListQnaHandler implements CommandHandler{ // 페이징을 써서 목록으로 보여주는 핸들러
	
	private static final String VIEW_PAGE = "/WEB-INF/views/qna/list.jsp";
	
	private IQnaService qnaService = QnaServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
		
		PagingVO pagingVO = new PagingVO();
		
		int totalCnt = qnaService.getTotalCnt();
		
		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(10);
		pagingVO.setPageSize(5);
		
		List<QnaVO> qnaList = qnaService.getQnaAll(pagingVO);
		
		req.setAttribute("qnaList", qnaList);
		req.setAttribute("pagingVO", pagingVO);
		
		return VIEW_PAGE;
	}

}
