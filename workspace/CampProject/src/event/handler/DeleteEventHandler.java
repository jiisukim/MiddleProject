package event.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import event.service.EventServiceImpl;
import event.service.IEventService;

public class DeleteEventHandler implements CommandHandler {

	private IEventService eventService = EventServiceImpl.getInstance();

	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return true;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {

		String evnCode = req.getParameter("evnCode");

		// 3. 회원정보 삭제하기
		int cnt = eventService.deleteEvent(evnCode);

		String msg = "";

		if (cnt > 0) {
			msg = "성공";
		} else {
			msg = "실패";
		}

		String redirectURL = req.getContextPath() + "/event/list.do?msg=" + URLEncoder.encode(msg, "utf-8");

		return redirectURL;
	}

}
