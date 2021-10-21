package notice.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import handler.CommandHandler;
import notice.service.HostNoticeService;
import notice.service.IHostNoticeService;
import vo.NoticeVO;

public class UpdateNoticeHandler implements CommandHandler{
	private static final String VIEW_PAGE = "/WEB-INF/views/host/noticeUpdateForm.jsp";
	
	private static final Logger LOGGER = Logger.getLogger(UpdateNoticeHandler.class);
	
	private IHostNoticeService noticeService = HostNoticeService.getInstance();

	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return false ; //forward
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return true; //redirect
		}
		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			String ntcCode = req.getParameter("ntcCode");
			
			//1. 회원정보 조회
			NoticeVO notVo = noticeService.getNotice(ntcCode);
			
			//2. 회원정보 저장
			req.setAttribute("notVo", notVo);
			
			return VIEW_PAGE;
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			
			String ntcTitle = req.getParameter("ntcTitle");
			String ntcCon = req.getParameter("ntcCon");
			String ntcCode = req.getParameter("ntcCode");
			
						
			NoticeVO nv = new NoticeVO();
			
			nv.setNtcTitle(ntcTitle);	
			nv.setNtcCon(ntcCon);
			nv.setNtcCode(ntcCode);
			
					
			int cnt = noticeService.updateNotice(nv);
			
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
