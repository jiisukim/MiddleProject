package faq.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import faq.dao.FaqDaoImpl;
import faq.dao.IFaqDao;
import util.SqlMapClientFactory;
import vo.FaqVO;
import vo.PagingVO;

public class FaqServiceImpl implements IFaqService{
	
	private IFaqDao faqdao;
	
	private static IFaqService faqService;
	
	private SqlMapClient smc;
	
	private FaqServiceImpl() {
		faqdao = FaqDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IFaqService getInstance() {
		if(faqService == null) {
			faqService = new FaqServiceImpl();
		}
		return faqService;
	}

	@Override
	public int insertFaq(FaqVO faq) {
		int cnt = 0 ;
		
		try {
			cnt = faqdao.insertFaq(smc, faq);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<FaqVO> getFaqWithPaging(PagingVO pagevo) {
		List<FaqVO> faqlist = new ArrayList<FaqVO>();
		
		try {
			faqlist = faqdao.getFaqWithPaging(smc, pagevo);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return faqlist;
	}

	@Override
	public int updateFaq(FaqVO faq) {
		int cnt = 0;
	
		try {
			cnt = faqdao.updateFaq(smc, faq);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteFaq(String faqCode) {
		int cnt = 0;
		
		try {
			cnt = faqdao.deleteFaq(smc, faqCode);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<FaqVO> getFaqDetail(FaqVO faq) {
		List<FaqVO> faqlist = new ArrayList<FaqVO>();
		
		try {
			faqlist = faqdao.getFaqDetail(smc, faq);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return faqlist;
	}

	@Override
	public FaqVO getFaq(String faqCode) {
		FaqVO faq = null;
		
		try {
			faq = faqdao.getFaq(smc, faqCode);
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		return faq;
	}

	@Override
	public int getTotalCnt() {
		int cnt = 0;
		
		try {
			cnt = faqdao.getTotalCnt(smc);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public String getAdminNick(String admCode) {
		String admNick = "";
		
		try {
			admNick = faqdao.getAdminNick(smc, admCode);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return admNick;
	}

	@Override
	public int getFaqDetailTotalCnt(FaqVO faq) {
		int cnt = 0;
		
		try {
			cnt = faqdao.getFaqDetailTotalCnt(smc, faq);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<FaqVO> getAllFaq() {
		List<FaqVO> faqlist = new ArrayList<FaqVO>();
		
		try {
			faqlist = faqdao.getAllFaq(smc);
		} catch (SQLException e) {			
			e.printStackTrace();
		}

		return faqlist;
	}
	
}
