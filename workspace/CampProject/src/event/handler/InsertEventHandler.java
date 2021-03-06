package event.handler;

import java.net.URLEncoder;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import comm.service.AtchfileServiceImpl;
import comm.service.IatchFileService;
import event.service.EventServiceImpl;
import event.service.IEventService;
import filter.FileUploadRequestWrapper;
import vo.AtFileVO;
import vo.EventVO;

public class InsertEventHandler implements CommandHandler {

	private static final Logger LOGGER = Logger.getLogger(InsertEventHandler.class); 
	
	private static final String VIEW_PAGE = "/WEB-INF/views/event/insert.jsp";
	
	private IEventService eventService = EventServiceImpl.getInstance();
	
	private IatchFileService fileService = AtchfileServiceImpl.getInstance();
	
	
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
			
			AtFileVO atchFileVO = new AtFileVO();
			
			
			// 멀티파트 처리된 래퍼객체가 맞는지 확인..
			if(FileUploadRequestWrapper.hasWrapper(req)) {
				
				Map<String, Object> fileItemMap = 
						((FileUploadRequestWrapper)req).getFileItemMap();
				
				LOGGER.info("파일 아이템 사이즈 : " + fileItemMap.size());
				
				if(fileItemMap.size() > 0) { // 파일이 존재하면...
					atchFileVO = fileService.saveAtchFileList(fileItemMap);
				}
			}
			
			// 1.요청 파라미터정보 가져오기
			String admCode = req.getParameter("admCode");
			String evnTitle = req.getParameter("evnTitle");
			String evnCon = req.getParameter("evnCon");
			String evnStart = req.getParameter("evnStart");
			String evnEnd = req.getParameter("evnEnd");
			
			
			EventVO ev = new EventVO();
			ev.setAdmCode(admCode);
			ev.setEvnTitle(evnTitle);
			ev.setEvnCon(evnCon);
			ev.setEvnStart(evnStart);
			ev.setEvnEnd(evnEnd);
			ev.setFileId(atchFileVO.getFileId()); // 첨부파일 ID 저장
			
			// 3. 회원등록
			int cnt = eventService.insertEvent(ev);
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			
	
			String redirectURL = req.getContextPath() 
					+ "/event/list.do?msg=" + URLEncoder.encode(msg, "utf-8");
			return redirectURL;
				
		}
		
		return null;
	}





}
