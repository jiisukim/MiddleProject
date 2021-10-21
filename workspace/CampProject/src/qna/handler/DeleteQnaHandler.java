package qna.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import qna.service.IQnaService;
import qna.service.QnaServiceImpl;

public class DeleteQnaHandler implements CommandHandler{
	
	private IQnaService qnaService = QnaServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return true; // 왜 갑자기 트루지??? 그동안 계속 false쓰다가.. 음... 내가 Controller를 잘 모르네
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String qnaCode = req.getParameter("qnaCode");
		
		int cnt = qnaService.deleteQna(qnaCode);
		
		String msg = "";
		
		if (cnt > 0) {
			msg = "성공";
		} else {
			msg = "실패";
		}
		
		String redirectURL = req.getContextPath() + "qna/list.do?msg=" + URLEncoder.encode(msg, "utf-8");
		
		return redirectURL;
	}

}
