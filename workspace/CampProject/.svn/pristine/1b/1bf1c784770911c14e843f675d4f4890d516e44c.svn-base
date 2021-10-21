package notice.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;

public class SearchNoticeHandler implements CommandHandler{


	private static final String  VIEW_PAGE = "/WEB-INF/views/host/searchNotice.jsp";
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String ntcTitle = req.getParameter("ntcTitle");
		System.out.println("ntcTitle" + ntcTitle);  // 공지 도착
		
		List<NoticeVO> hostList = new ArrayList<NoticeVO>();
		List<NoticeVO> noticeList = noticeService.searchNotice(ntcTitle);
		
		req.setAttribute("noticeList", noticeList);
		
		
		return VIEW_PAGE;
	}

}