package mamManage.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.handler.CommandHandler;
import mamManage.service.IMemManagerService;
import mamManage.service.MemManagerServiceImpl;
import vo.MemVO;

public class ViewMemManagerHandler implements CommandHandler {
private static final String VIEW_PAGE = ""; ///WEB-INF/views/member/select.jsp
	
	private IMemManagerService memManageService = MemManagerServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String memId = req.getParameter("memId");
		
		// 1. 회원정보 조회
		MemVO memVO = memManageService.getMember(memId);
		
		// 3. 결과 정보 담기
		req.setAttribute("memVO", memVO);
		return VIEW_PAGE;
	}
	
	
}
