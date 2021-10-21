package notice.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;

public class DeleteNoticeHandler implements CommandHandler{

	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return true; // 리다이렉트
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// 1. 요청파라미터 정보가져오기
		String ntcCode = req.getParameter("ntcCode");
		
		
		// 2. 회원정보 삭제하기
		int cnt = noticeService.deleteNotice(ntcCode);
		
		String msg = "" ;
		
		if(cnt > 0) {
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		String redirectURL = req.getContextPath() + "/host/hostNotice.do?msg=" + URLEncoder.encode(msg,"utf-8");
		
		
		return redirectURL;
	}

}
