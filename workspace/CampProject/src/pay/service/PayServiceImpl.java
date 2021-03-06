package pay.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import pay.dao.IPayDao;
import pay.dao.PayDaoImpl;
import util.SqlMapClientFactory;
import vo.CampBookVO;
import vo.CampHostVO;

public class PayServiceImpl implements IPayService{

	private SqlMapClient smc;
	
	private IPayDao paydao;
	
	private static IPayService payService;
	
	private PayServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		paydao = PayDaoImpl.getInstance();		
	}	
	public static IPayService getInstance() {
		if(payService == null) {
			payService = new PayServiceImpl();
		}
		return payService;		
	}
		
	
	@Override
	public CampHostVO searchCampHost(String cmpCode) {
		
		
		CampHostVO camphost = null;
		try {
			camphost = paydao.searchCampHost(smc, cmpCode);
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
		return camphost;
	}
	@Override
	public int insertCampbook(CampBookVO campbook) {
		int cnt = 0;
		
		try {
			cnt = paydao.insertCampbook(smc, campbook);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

	
}
