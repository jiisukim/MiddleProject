package campRev.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import campRev.service.CampRevServiceImpl;
import campRev.service.ICampRevService;
import comm.handler.CommandHandler;
import vo.PagingVO;
import vo.ViewRevVo;

public class ListCampRevHandler implements CommandHandler{
	
	private static final String VIEW_PAGE = "/WEB-INF/views/camprev/list.jsp";
	
	private ICampRevService revService = CampRevServiceImpl.getInstance();

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
		
		PagingVO pagingVO = new PagingVO();
		
		int totalCnt = revService.getTotalCnt();
		
		pagingVO.setTotalCount(totalCnt);
		pagingVO.setCurrentPageNo(pageNo);
		pagingVO.setCountPerPage(10);
		pagingVO.setPageSize(5);
		
		List<ViewRevVo> revList = revService.getRevAll(pagingVO);
		
		req.setAttribute("revList", revList);
		req.setAttribute("pagingVO", pagingVO);
		
		return VIEW_PAGE;
	}
	

}
