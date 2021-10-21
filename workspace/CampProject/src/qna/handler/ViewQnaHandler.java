package qna.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import qna.service.IQnaService;
import qna.service.QnaServiceImpl;
import vo.QnaVO;

public class ViewQnaHandler implements CommandHandler{ // 한 게시글만 보여주는 핸들러
	
	private static final String  VIEW_PAGE = "/WEB-INF/views/qna/select.jsp";
	
	private IQnaService qnaService = QnaServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String qnaCode = req.getParameter("qnaCode");
		
		QnaVO qnaVO = qnaService.getQna(qnaCode);
		
		req.setAttribute("qnaVO", qnaVO);
		return VIEW_PAGE;
	}
	
	
}
