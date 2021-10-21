package campMangage.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import campMangage.dao.CampManageDaoImpl;
import campMangage.dao.ICampManageDao;
import util.SqlMapClientFactory;
import vo.CampHostVO;
import vo.PagingVO;

public class CampManagerServiceImpl implements ICampManagerService {
	private ICampManageDao campDao;
	
	private static ICampManagerService CampManagerService;
	
	private SqlMapClient smc;
	
	private CampManagerServiceImpl() {
		campDao = CampManageDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ICampManagerService getInstance() {
		
		if(CampManagerService == null) {
			CampManagerService = new CampManagerServiceImpl();
		}
		
		return CampManagerService;
	}

	@Override
	public List<CampHostVO> getAllCampingList(PagingVO pagingVO) {
		List<CampHostVO> memList = new ArrayList<CampHostVO>();
		
		try {
			memList = campDao.getAllCampingList(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memList;
	}

	@Override
	public int getTotalCnt() {
		int cnt = 0;
		
		try {
			cnt = campDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}

	@Override
	public boolean checkCamping(String memId) {
		boolean chk = false;
		
		try {
			chk = campDao.checkCamping(smc, memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return chk;
	}

	@Override
	public List<CampHostVO> getSearchCamping(CampHostVO cv) {
		List<CampHostVO> memList = new ArrayList();
		
		try {
			memList = campDao.getSearchCamping(smc, cv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memList;
	}

	@Override
	public CampHostVO getCamping(String memId) {
		CampHostVO mv = null;
		try {
			mv = campDao.getCamping(smc, memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mv;
	}

	@Override
	public int updateCamping(CampHostVO cv) {
		int cnt = 0;
		
		try {
			cnt = campDao.updateCamping(smc, cv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	


}
