package qna.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import qna.service.IQnaService;
import qna.service.QnaServiceImpl;
import vo.NoticeVO;
import vo.QnaVO;


public class UpdateQnaHandler implements CommandHandler {
	
	private static final String VIEW_PAGE = "/WEB-INF/views/qna/Update.jsp";
	
	private static final Logger LOGGER = Logger.getLogger(UpdateQnaHandler.class);
	
	private IQnaService qnaService = QnaServiceImpl.getInstance();

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
			String qnaCode = req.getParameter("qnaCode");
			
			QnaVO qnaVO = qnaService.getQna(qnaCode);
			
			req.setAttribute("qnaVO", qnaVO);
			
			return VIEW_PAGE;
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			
			String qnaTitle = req.getParameter("qnaTitle");
			String qnaCon = req.getParameter("qnaCon");
			String qnaCode = req.getParameter("qnaCode");
						
			QnaVO qnaVO = new QnaVO();
			
			qnaVO.setQnaTitle(qnaTitle);	
			qnaVO.setQnaCon(qnaCon);
			qnaVO.setQnaCode(qnaCode);//아 혹시 qna코드가 유형인가 번호가 아니라?
			
					
			int cnt = qnaService.updateQna(qnaVO);
			
			String msg = "";
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			
			String redirectURL = req.getContextPath() +"/qna/qnalist.do?msg="+ URLEncoder.encode(msg,"utf-8");
			
			return redirectURL;
		}
		
		return null;
	}

	
}
