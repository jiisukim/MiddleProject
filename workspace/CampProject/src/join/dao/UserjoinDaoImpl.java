package join.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import vo.MemVO;

public class UserjoinDaoImpl implements IUserjoinDao{

	private static IUserjoinDao userdao;
	
	private UserjoinDaoImpl() {
		
	}
	
	public static IUserjoinDao getInstance() {
		if(userdao == null) {
			userdao = new UserjoinDaoImpl();
		}
		return userdao;
	}

	@Override
	public boolean checkMemId(SqlMapClient smc, String memId) throws  SQLException {
		boolean check = false;
		List<MemVO> member = null;
		
		member = smc.queryForList("userjoin.searchMemListByMemId", memId);
		if(member != null && member.size() != 0) {
			check = true;
		}		
		
		return check;
	}

	@Override
	public boolean checkMemNick(SqlMapClient smc, String memNick) throws SQLException {
		boolean check = false;
		List<MemVO> member = null;
		
		member = smc.queryForList("userjoin.searchMemListByMemNick", memNick);
		if(member != null && member.size() != 0) {
			check = true;
		}			
		
		return check;
	}

	@Override
	public int insertMember(SqlMapClient smc, MemVO member) throws SQLException {
		
		int cnt = 0;
		Object obj = smc.insert("userjoin.insertMember", member);
		if(obj == null) {
			cnt = 1 ;
		}		
		
		return cnt;
	}
	
	
	
	
}
