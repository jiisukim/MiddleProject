package notice.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;

public class ViewNoticeHandler implements CommandHandler{

	private static final String  VIEW_PAGE = "/WEB-INF/views/host/select.jsp";
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String ntcCode = req.getParameter("ntcCode");
		
		NoticeVO notVo = noticeService.getNotice(ntcCode);
		
		req.setAttribute("notVo", notVo);
		return VIEW_PAGE;
	}

}
