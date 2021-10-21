package notice.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;

public class SearchNoticeHandler implements CommandHandler{


	private static final String  VIEW_PAGE = "/WEB-INF/views/host/hostNotice.jsp";
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		System.out.println("zzzz");
		String ntcTitle = req.getParameter("ntcTitle");
		
		NoticeVO notVo = noticeService.searchNotice(ntcTitle);
		
		req.setAttribute("notVo", notVo);
		return VIEW_PAGE;
	}

}