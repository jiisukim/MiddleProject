package join.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import join.dao.HostjoinDaoImpl;
import join.dao.IHostjoinDao;
import util.SqlMapClientFactory;
import vo.CampHostVO;

public class HostjoinServiceImpl implements IHostjoinService{

	private SqlMapClient smc;
	
	private IHostjoinDao hostjoinDao;
	//1)
	private static IHostjoinService hostjoinService;
	//2)
	private HostjoinServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		hostjoinDao = HostjoinDaoImpl.getInstance();
	}
	//3)
	public static IHostjoinService getInstance() {
		if(hostjoinService == null) {
			hostjoinService = new HostjoinServiceImpl();
		}
		return hostjoinService;
	}
	
	
	@Override
	public boolean checkCampId(String cmpId) {
		boolean check = false;
		
		try {
			check = hostjoinDao.checkCampId(smc, cmpId);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return check;
	}

	@Override
	public boolean checkCampNick(String cmpNick) {
		boolean check = false;
		
		try {
			check = hostjoinDao.checkCampNick(smc, cmpNick);
		}catch(SQLException e) {
			e.printStackTrace();
		}		
		
		return check;
	}
	@Override
	public int insertCamphost(CampHostVO camphost) {
		int cnt = 0;
		
		 try {
			cnt = hostjoinDao.insertCamphost(smc, camphost);
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		return cnt;
	}
	@Override
	public int insertCampact(CampHostVO camphost) {
		int cnt = 0;
		
		try {
			cnt = hostjoinDao.insertCampact(smc, camphost);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	@Override
	public int insertCampthm(CampHostVO camphost) {
		int cnt = 0;
		
		try {
			cnt = hostjoinDao.insertCampthm(smc, camphost);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
		
	}

}
