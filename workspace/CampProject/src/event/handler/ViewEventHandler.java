package event.handler;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import comm.service.AtchfileServiceImpl;
import comm.service.IatchFileService;
import event.service.EventServiceImpl;
import event.service.IEventService;
import vo.AtFileVO;
import vo.EventVO;

public class ViewEventHandler implements CommandHandler {
	
	private static final String VIEW_PAGE = "/WEB-INF/views/event/select.jsp";
	
	private IEventService eventService = EventServiceImpl.getInstance();
	
	private IatchFileService fileService = AtchfileServiceImpl.getInstance();
	

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
		
	}
		
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
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
		
		// 3. 결과 정보 담기
		req.setAttribute("eventVO", eventVO);
		
		return VIEW_PAGE;
	}

}