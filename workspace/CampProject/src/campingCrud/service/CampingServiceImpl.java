package campingCrud.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import campingCrud.dao.CampingDaoImpl;
import campingCrud.dao.ICampingDao;
import util.SqlMapClientFactory;
import vo.CampHostVO;
import vo.NoticeVO;

public class CampingServiceImpl implements ICampingService{

	private ICampingDao campingDao;
	
	private static ICampingService campingService;
	
	private SqlMapClient smc;
	
	public static ICampingService getInstance() {
		
		if(campingService == null) {
			campingService = new CampingServiceImpl();
		}
		
		return campingService;
	}
	
	private CampingServiceImpl() {
		campingDao = CampingDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	

	@Override
	public int updateCamping(CampHostVO cv) throws SQLException {
		int cnt = 0;
		
		try {
			
			cnt = campingDao.updateCamping(smc, cv);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return cnt;
	}

	@Override
	public int deleteCamping(String cmpId) throws SQLException {
		int cnt = 0;
		
		try {
			
			cnt = campingDao.deleteCamping(smc, cmpId);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		return cnt;
	}

	@Override
	public CampHostVO getCamping(String cmpId) {
		CampHostVO cv = null;
		try {
			cv = campingDao.getCamping(smc, cmpId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cv;
	}

	


}
