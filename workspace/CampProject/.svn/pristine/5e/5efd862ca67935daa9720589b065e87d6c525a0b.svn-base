package adminCrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.MemVO;
import vo.PagingVO;

public class AdminDao implements IAdminDao {
	private static IAdminDao memDao;

	private AdminDao() {
	}

	public static IAdminDao getInstance() {
		if (memDao == null) {
			memDao = new AdminDao();
		}
		return memDao;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer) smc.queryForObject("admin.getTotalCnt");

		return cnt;
	}

	@Override
	public List<MemVO> getMemAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		List<MemVO> memList = smc.queryForList("admin.getMemAll", pagingVO);

		return memList;
	}

	@Override
	public int updateMem(SqlMapClient smc, MemVO mv) throws SQLException {
		int cnt = smc.update("admin.updateMem", mv);
		return cnt;
	}

	@Override
	public int deleteMem(SqlMapClient smc, String memCode) throws SQLException {
		int cnt = smc.delete("admin.deleteMem", memCode);

		return cnt;
	}

	@Override
	public MemVO getMem(SqlMapClient smc, String memCode) throws SQLException {
		MemVO mv = (MemVO)smc.queryForObject("admin.getMem", memCode);

		return mv;
	}

}
