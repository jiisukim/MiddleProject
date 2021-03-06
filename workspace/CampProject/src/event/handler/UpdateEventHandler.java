package event.handler;

import java.net.URLEncoder;
import java.util.List;
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

public class UpdateEventHandler implements CommandHandler {
	private static final Logger LOGGER = Logger.getLogger(InsertEventHandler.class); 
	
	private static final String VIEW_PAGE ="/WEB-INF/views/event/update.jsp";
	
	private IEventService eventService = EventServiceImpl.getInstance();
	private IatchFileService fileService = AtchfileServiceImpl.getInstance();
	

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return false; // forward
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return true; // redirect
		}
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
if(req.getMethod().equalsIgnoreCase("GET")) {
			
			String evnCode = req.getParameter("evnCode");
			
		// 1. 이벤트 조회
			EventVO eventVO = eventService.getEvent(evnCode);
			
		// 2. 첨부파일 정보 조회
			if(eventVO.getFileId() > 0) {
				
				AtFileVO fileVO = new AtFileVO();
				fileVO.setFileId(eventVO.getFileId());
				
				List<AtFileVO> fileList = fileService.getAtchFileList(fileVO);
				
				req.setAttribute("fileList", fileList);
			}
			
			
			// 3. request객체에 이벤트 정보 저장
			req.setAttribute("eventVO", eventVO);
			
			return VIEW_PAGE;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			//기존의 첨부파일 아이디 정보 가져오기
			long fileId = req.getParameter("fileId") == null ?
							-1 : Long.parseLong(req.getParameter("fileId"));
			
			AtFileVO atchFileVO = new AtFileVO();
			atchFileVO.setFileId(fileId);
			
			
			//멀티파트 처리된 래퍼객체 맞는지...
			
			if(FileUploadRequestWrapper.hasWrapper(req)) {
				
				Map<String, Object> fileItemMap = 
						((FileUploadRequestWrapper)req).getFileItemMap();
				
				LOGGER.info("파일 아이템 사이즈 : " + fileItemMap.size());
				
				if(fileItemMap.size() > 0) { 
					atchFileVO = fileService.saveAtchFileList(fileItemMap);
				}
			}
			
			// 1. 요청파라미터 정보 가져오기
			String evnCode = req.getParameter("evnCode");
			String evnTitle = req.getParameter("evnTitle");
			String evnCon = req.getParameter("evnCon");
			String evnStart = req.getParameter("evnStart");
			String evnEnd = req.getParameter("evnEnd");
			
			EventVO ev = new EventVO();
			
			ev.setEvnCode(evnCode);
			ev.setEvnTitle(evnTitle);
			ev.setEvnCon(evnCon);
			ev.setEvnStart(evnStart);
			ev.setEvnEnd(evnEnd);
			ev.setFileId(atchFileVO.getFileId());
			
			
			// 3. 회원정보 수정하기
			int cnt = eventService.updateEvent(ev);
			
			String msg = "";
			if( cnt > 0) {
				msg = "성공!";
			}else {
				msg = "실패";
			}
			
			String redirecURL = req.getContextPath() 
					+ "/event/list.do?msg=" + URLEncoder.encode(msg, "utf-8");
			
			return redirecURL;
		}
		
		return null;
	}

}
