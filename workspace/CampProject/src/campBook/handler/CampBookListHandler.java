package campBook.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campBook.service.CampBookService;
import campBook.service.ICampBookService;
import comm.handler.CommandHandler;
import vo.CampBookVO;

import vo.PagingVO;

public class CampBookListHandler implements CommandHandler {
	private static final String VIEW_PAGE = "/WEB-INF/views/campBook/CampBook.jsp";

	private ICampBookService campBookService = CampBookService.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {

		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 1. 요청 페이지 번호 가져오기
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));

		PagingVO pagingVO = new PagingVO();

		int totalCnt = campBookService.getTotalCnt();

		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(5);
		pagingVO.setPageSize(5);

		// 2. 회원정보 조회
		List<CampBookVO> campBookList = campBookService.getCampBookAll(pagingVO);
		List<CampBookVO> parsedList = new ArrayList<CampBookVO>();
		for (CampBookVO camp : campBookList) {
			String bkDayout = camp.getBkDayout(); // 2021-06-04 00:00:00
			String bkDayin = camp.getBkDayin();

			bkDayout = stripDate(bkDayout);// 2021-06-04
			bkDayin = stripDate(bkDayin);

			camp.setBkDayin(bkDayin);
			camp.setBkDayout(bkDayout);

			parsedList.add(camp);
		}

		req.setAttribute("campBookList", parsedList);
		req.setAttribute("pagingVO", pagingVO);

		return VIEW_PAGE;
	}

	private String stripDate(String bkDayout) {
		bkDayout = bkDayout.substring(0, 11).trim();
		return bkDayout;
	}

}
