package campMangage.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampHostVO;
import vo.PagingVO;

public class CampManageDaoImpl implements ICampManageDao {
	private static ICampManageDao CampManageDao;
	
	private CampManageDaoImpl() {
		
	}
	
	public static ICampManageDao getInstance() {
		if(CampManageDao == null) {
			CampManageDao = new CampManageDaoImpl();
		}
		
		return CampManageDao;
	}

	

	@Override
	public boolean checkCamping(SqlMapClient smc, String memId) throws SQLException {
		boolean check = false;
		
		int count = (Integer) smc.queryForObject("campManage.checkCamping", memId);
		
		if(count > 0) {
			check = true;
		}
		
		return check;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer) smc.queryForObject("campManage.getTotalCnt");
		return cnt;
	}

	@Override
	public List<CampHostVO> getAllCampingList(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		List<CampHostVO> campList = 
				smc.queryForList("campManage.getCampingAll", pagingVO);
		
		return campList;
	}



	

	@Override
	public List<CampHostVO> getSearchCamping(SqlMapClient smc, CampHostVO cv) throws SQLException {
		List<CampHostVO> campList = 
				smc.queryForList("campManage.getSearchCamping", cv);
		
		return campList;
	}

	@Override
	public CampHostVO getCamping(SqlMapClient smc, String memId) throws SQLException {
		CampHostVO cv = (CampHostVO) smc.queryForObject("campManage.getCamping", memId);
		return cv;
	}

	@Override
	public int updateCamping(SqlMapClient smc, CampHostVO cv) throws SQLException {
		int cnt = smc.update("campManage.updateCamping", cv);
		
		return cnt;
	}


	
}
