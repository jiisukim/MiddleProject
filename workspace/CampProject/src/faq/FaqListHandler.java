package faq;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import faq.service.FaqServiceImpl;
import faq.service.IFaqService;
import vo.ConstVO;
import vo.FaqVO;
import vo.PagingVO;

public class FaqListHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(FaqListHandler.class);
	private IFaqService faqService = FaqServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";		
		
		if(req.getMethod().equalsIgnoreCase("GET")) {			
			
			// 요청 페이지 번호 가져오기
			int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
			int totalCnt = faqService.getTotalCnt();
			
			PagingVO pagevo = getPagingVo(pageNo, totalCnt);
			
			List<FaqVO> list = faqService.getFaqWithPaging(pagevo);
			
			
			if(list != null && list.size() != 0) {
				
				List<FaqVO> faqlist = new ArrayList<FaqVO>();
				
				for( FaqVO faq : list) { // AdmCode에 admNick바꿔넣음
					String admCode = faq.getAdmCode();
					String admNick = faqService.getAdminNick(admCode);
					faq.setAdmCode(admNick);
					faqlist.add(faq);			
				}			
				req.setAttribute("faqlist", faqlist);
			}else {
				req.setAttribute("faqlist", list);
			}
			
			
			req.setAttribute("pagevo", pagevo);			
			
			url = ConstVO.VIEW_FAQ_LIST;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			String flag = req.getParameter("flag");
			
			if("title".equalsIgnoreCase(flag)) {
				searchTitle(req);
//				url = ConstVO.VIEW_FAQ_RESULT;
			}else if("contents".equalsIgnoreCase(flag)) {
				
			}else if("nickname".equalsIgnoreCase(flag)) {
				
			}
		}
		
		return url;
	}

	private void searchTitle(HttpServletRequest req) {
		String faqTitle = req.getParameter("search");
		FaqVO faq = new FaqVO();		
		
		faq.setFaqTitle(faqTitle);		
		
		List<FaqVO> list = faqService.getFaqDetail(faq);
		
		if(list != null && list.size() != 0) {
			
			List<FaqVO> faqlist = new ArrayList<FaqVO>();
			
			for( FaqVO faqs : list) { // AdmCode에 admNick바꿔넣음
				String admCode = faqs.getAdmCode();
				String admNick = faqService.getAdminNick(admCode);
				faqs.setAdmCode(admNick);
				faqlist.add(faqs);			
			}			
			req.setAttribute("faqlist", faqlist);
		}else {
			req.setAttribute("faqlist", list);
		}		
		
		//페이징
		int pageNo = req.getParameter("pageNo") == null ? 1 : Integer.parseInt(req.getParameter("pageNo"));
		int totalCnt = faqService.getFaqDetailTotalCnt(faq);
		
		PagingVO pagevo = getPagingVo(pageNo, totalCnt);
		
		req.setAttribute("pagevo", pagevo);
	}
	
	private PagingVO getPagingVo(int pageNo, int totalCnt) {
		PagingVO pagevo = new PagingVO();		
		
		pagevo.setTotalCount(totalCnt);
		pagevo.setCurrentPageNo(pageNo);
		pagevo.setCountPerPage(10); //페이지당 게시되는 게시물 건수
		pagevo.setPageSize(5); //페이지목록 게시되는 페이지 수 
		
		return pagevo;		
	}

}
