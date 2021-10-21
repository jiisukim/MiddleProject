package join.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import vo.CampHostVO;

public class HostjoinDaoImpl implements IHostjoinDao{
	//1)
	private static IHostjoinDao hostjoinDao;
	//2)
	private HostjoinDaoImpl() {
		
	}
	//3)
	public static IHostjoinDao getInstance() {
		if(hostjoinDao == null) {
			hostjoinDao = new HostjoinDaoImpl();
		}
		return hostjoinDao;
	}
	
	
	@Override
	public boolean checkCampId(SqlMapClient smc, String cmpId)throws SQLException {
		boolean check = false;
		List<CampHostVO> camphost = null;		
		
		camphost = smc.queryForList("hostjoin.searchCampListByCmpId", cmpId);
		
		if(camphost != null && camphost.size() != 0) {
			check = true;
		}
		
		return check;
	}

	@Override
	public boolean checkCampNick(SqlMapClient smc ,String cmpNick) throws SQLException {
		boolean check = false;
		List<CampHostVO> camphost = null;
		
		camphost = smc.queryForList("hostjoin.searchCampListByCmpNick", cmpNick);
		
		if(camphost != null && camphost.size() != 0) {
			check = true;
		}
		
		return check;
	}
	@Override
	public int insertCamphost(SqlMapClient smc, CampHostVO camphost) throws SQLException {
		
		int cnt = 0;
		Object obj =  smc.insert("hostjoin.insertCamphost",camphost);
		
		if(obj != null) { //selectkey가 들어가서 뭔가 무조건 나와야함
			cnt = 1 ;
		}
				
		return cnt;
	}
	@Override
	public int insertCampact(SqlMapClient smc, CampHostVO camphost) throws SQLException {
		int cnt = 0;
		
		Object obj = smc.insert("hostjoin.insertCampact", camphost);
		if(obj == null) {
			cnt = 1;
		}			
		return cnt;
	}
	@Override
	public int insertCampthm(SqlMapClient smc, CampHostVO camphost) throws SQLException {
		int cnt = 0;
		
		Object obj = smc.insert("hostjoin.insertCampthm", camphost);
		if(obj == null) {
			cnt = 1;
		}		
		return cnt;
	}

}
