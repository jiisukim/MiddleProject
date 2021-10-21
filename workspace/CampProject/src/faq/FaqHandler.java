package faq;

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

public class FaqHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(FaqHandler.class);
	private IFaqService faqService = FaqServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";
		
		if(req.getMethod().equalsIgnoreCase("GET")) {
			List<FaqVO> faqlist = faqService.getAllFaq();
			
			req.setAttribute("faqlist", faqlist);
			
			url = ConstVO.VIEW_FAQ_LIST;						
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			String flag = req.getParameter("flag");
			
			if("insert".equalsIgnoreCase(flag)) {
				
			}else if("delete".equalsIgnoreCase(flag)) {
				
			}else if("update".equalsIgnoreCase(flag)){
				
			}
			
		}
		
		return url;		
	}

}
