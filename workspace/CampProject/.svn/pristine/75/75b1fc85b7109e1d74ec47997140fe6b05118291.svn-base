package notice.handler;



import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;

public class InsertNoticeHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(InsertNoticeHandler.class);
	
	private static final String VIEW_PAGE = "/WEB-INF/views/host/noticeInsertForm.jsp";
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();
	
	
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equals("GET")) {
			return false; // forward
		}else if(req.getMethod().equals("POST")) {
			return true; // redirect
		}
		return false;
		
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equals("GET")) {
			return VIEW_PAGE;
		}else if(req.getMethod().equals("POST")) {
			// 1.요청 파라미터정보 가져오기
			
			String admCode = req.getParameter("admCode");
			String ntcTitle = req.getParameter("ntcTitle");
			String ntcCon = req.getParameter("ntcCon");
			
						
			NoticeVO nv = new NoticeVO();
			
			
			nv.setAdmCode(admCode);
			nv.setNtcTitle(ntcTitle);
			nv.setNtcCon(ntcCon);
			
			int cnt = noticeService.insertNotice(nv);
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			
			String redirectURL = req.getContextPath() +"/host/hostNotice.do?msg="+ URLEncoder.encode(msg,"utf-8");
			
			return redirectURL;
		}
		
		return null;
	}

}
