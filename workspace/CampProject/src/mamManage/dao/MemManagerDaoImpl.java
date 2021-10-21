package mamManage.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.MemVO;
import vo.PagingVO;

public class MemManagerDaoImpl implements IMemManagerDao{
	private static IMemManagerDao memManageDao;
	
	private MemManagerDaoImpl() {
		
	}
	
	public static IMemManagerDao getInstance() {
		if(memManageDao == null) {
			memManageDao = new MemManagerDaoImpl();
		}
		
		return memManageDao;
	}

	@Override
	public List<MemVO> getSearchMember(SqlMapClient smc, MemVO mv) throws SQLException {
		List<MemVO> memList = 
				smc.queryForList("mamManage.getSearchMember", mv);
		
		return memList;
	}

	@Override
	public MemVO getMember(SqlMapClient smc, String memId) throws SQLException {
		MemVO mv = (MemVO) smc.queryForObject("mamManage.getMember", memId);

		return mv;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer) smc.queryForObject("mamManage.getTotalCnt");
		return cnt;
	}

	@Override
	public List<MemVO> getAllMemberList(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		List<MemVO> memList = 
				smc.queryForList("mamManage.getMemberAll", pagingVO);
		
		
		return memList;
	}
	

}
