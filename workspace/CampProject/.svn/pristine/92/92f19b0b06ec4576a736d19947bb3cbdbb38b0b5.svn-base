package faq.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.FaqVO;
import vo.PagingVO;

public class FaqDaoImpl implements IFaqDao{

	private static IFaqDao faqDao;
	
	private FaqDaoImpl() {
		
	}
	
	public static IFaqDao getInstance() {
		if(faqDao == null) {
			faqDao = new FaqDaoImpl();
		}
		return faqDao;
	}
	
	
	@Override
	public int insertFaq(SqlMapClient smc, FaqVO faq) throws SQLException {
		int cnt = 0;
		
		Object obj = smc.insert("faq.insertFaq", faq);
		
		if(obj == null) {
			cnt = 1;
		}
		
		return cnt;
	}

	@Override
	public List<FaqVO> getFaqWithPaging(SqlMapClient smc, PagingVO pagevo) throws SQLException {
		
		List<FaqVO> faqlist = smc.queryForList("faq.getFaqWithPaging", pagevo);
		
		return faqlist;
	}

	@Override
	public int updateFaq(SqlMapClient smc, FaqVO faq) throws SQLException {
		
		int cnt = smc.update("faq.updateFaq", faq);
		
		return cnt;
	}

	@Override
	public int deleteFaq(SqlMapClient smc, String faqCode) throws SQLException {
		
		int cnt = smc.delete("faq.deleteFaq", faqCode);
		return cnt;
	}

	@Override
	public List<FaqVO> getFaqDetail(SqlMapClient smc, FaqVO faq) throws SQLException {
		
		List<FaqVO> faqlist =  smc.queryForList("faq.getFaqDetail", faq);
		return faqlist;
	}

	@Override
	public FaqVO getFaq(SqlMapClient smc, String faqCode) throws SQLException {
		
		FaqVO faq = (FaqVO) smc.queryForObject("faq.getFaq", faqCode);
		return faq;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		
		int cnt = (Integer) smc.queryForObject("faq.getTotalCnt");
		
		return cnt;
	}

	@Override
	public String getAdminNick(SqlMapClient smc, String admCode) throws SQLException {
		
		String admNick = (String) smc.queryForObject("faq.getAdminNick", admCode);
		
		return admNick;
	}

	@Override
	public int getFaqDetailTotalCnt(SqlMapClient smc, FaqVO faq) throws SQLException {
		int cnt = (Integer)smc.queryForObject("faq.getFaqDetailTotalCnt", faq);
		
		return cnt;
	}

	@Override
	public List<FaqVO> getAllFaq(SqlMapClient smc) throws SQLException {
		
		List<FaqVO> faqlist = smc.queryForList("faq.getAllFaq");
		
		return faqlist;
	}

}
