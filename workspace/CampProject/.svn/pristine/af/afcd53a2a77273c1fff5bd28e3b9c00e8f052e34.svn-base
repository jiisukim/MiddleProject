package pay.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampBookVO;
import vo.CampHostVO;

public class PayDaoImpl implements IPayDao{

	private static IPayDao paydao;
	
	private PayDaoImpl() {
		
	}
	
	public static IPayDao getInstance() {
		if(paydao == null) {
			paydao = new PayDaoImpl();
		}
		return paydao;
	}
	
	@Override
	public CampHostVO searchCampHost(SqlMapClient smc, String cmpCode) throws SQLException {
		
		CampHostVO camphost = (CampHostVO) smc.queryForObject("pay.searchCampHost", cmpCode);
		
		return camphost;
	}

	@Override
	public int insertCampbook(SqlMapClient smc, CampBookVO campbook) throws SQLException {
		
		int cnt = 0;
		Object obj = smc.insert("pay.insertCampbook", campbook);
		
		if(obj != null) { //selectkey사용
			cnt = 1 ;
		}
		
		return cnt;
	}


	
	
}
