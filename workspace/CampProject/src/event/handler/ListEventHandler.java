package event.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import event.service.EventServiceImpl;
import event.service.IEventService;
import vo.EventVO;
import vo.PagingVO;

public class ListEventHandler implements CommandHandler {

	private static final String VIEW_PAGE = "/WEB-INF/views/event/list.jsp";

	private IEventService eventService = EventServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {

		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 1. 요청 페이지 번호 가져오기
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));

		PagingVO pagingVO = new PagingVO();

		int totalCnt = eventService.getTotalCnt();

		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(5);
		pagingVO.setPageSize(5);

		// 2. 회원정보 조회
		List<EventVO> eventList = eventService.getEventAll(pagingVO);
		List<EventVO> parse = new ArrayList<EventVO>();

		for (EventVO event : eventList) {
			String evnStart = event.getEvnStart();
			String evnEnd = event.getEvnEnd();

			evnStart = stripDate(evnStart);
			evnEnd = stripDate(evnEnd);

			event.setEvnStart(evnStart);
			event.setEvnEnd(evnEnd);

			parse.add(event);
		}

		req.setAttribute("eventList", parse);
		req.setAttribute("pagingVO", pagingVO);

		return VIEW_PAGE;
	}

	private String stripDate(String evnStart) {
		evnStart = evnStart.substring(0, 10).trim();

		return evnStart;
	}

}