package campRev.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.PagingVO;
import vo.QnaVO;
import vo.ViewRevVo;

public class CampRevDaoImpl implements ICampRevDao{
	
	private static ICampRevDao revDao;
	
	private CampRevDaoImpl() {
	}
	
	public static ICampRevDao getInstance()	{
		if(revDao == null) {
			revDao = new CampRevDaoImpl();
		}
		return revDao;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer)smc.queryForObject("campRev.getTotalCnt");
	    return cnt;
	}

	@Override
	public List<ViewRevVo> getCampRevAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		List<ViewRevVo> revList = smc.queryForList("campRev.getCampRevAll", pagingVO);
	     return revList;
	}

}
