package campingCrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import join.dao.HostjoinDaoImpl;
import join.dao.IHostjoinDao;
import notice.dao.HostNoticeDao;
import notice.dao.IHostNoticeDao;
import vo.CampHostVO;
import vo.NoticeVO;

public class CampingDaoImpl implements ICampingDao{
	private static ICampingDao campingDao;
	
	private CampingDaoImpl() {}
	
	public static ICampingDao getInstance() {
		if(campingDao == null) {
			campingDao = new CampingDaoImpl();
		}
		return campingDao;
	}
		
		
		
	@Override
	public int updateCamping(SqlMapClient smc, CampHostVO cv) throws SQLException {
		int cnt = smc.update("campingCrud.updateMember", cv);
		
		return cnt;
	}

	@Override
	public int deleteCamping(SqlMapClient smc, String cmpId) throws SQLException {
		// namespace.메서드이름
		int cnt = smc.delete("campingCrud.deleteCamping", cmpId);
		
		return cnt;
	}

	@Override
	public CampHostVO getCamping(SqlMapClient smc, String cmpId) throws SQLException {
		CampHostVO cv = (CampHostVO)smc.queryForObject("campingCrud.getCamping", cmpId);
		
		return cv;
	}





	

}
