package login.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.MemVO;

public class UserLoginDaoImpl implements IUserLoginDao{
	
	//1)
	private static IUserLoginDao userLoginDao;
	
	//2)
	private UserLoginDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	//3)
	public static IUserLoginDao getInstance() {
		if(userLoginDao == null) {
			userLoginDao = new UserLoginDaoImpl();
		}
		return userLoginDao;
	}
	

	@Override
	public MemVO checkUser(SqlMapClient smc, String userId, String userPW) throws SQLException {
		
//		MemberVO mv = 
//				(MemberVO)smc.queryForObject("member.getMember", memId);
//				
//		return mv;
		
		
		MemVO memvo = (MemVO) smc.queryForObject("userLogin.chkUser", userId);
		
		
		
		return  memvo;
		
	}

	@Override
	public boolean checkUserPW(SqlMapClient smc, String userPW) throws SQLException {
		
		boolean chk = false;
		List<MemVO> memvo2 = null;
		
		memvo2 = smc.queryForList("userLogin.chkUserByMemPw", userPW);
		
		if(memvo2 != null && memvo2.size() != 0) {
			chk = true;
		}
		
		return chk;
		
	}

	@Override
	public MemVO getmemVO(SqlMapClient smc, MemVO memVO) throws SQLException {
		
		Object obj =  smc.queryForObject("userLogin.chkUserByMemId", memVO);
		
		if(obj == null) {
			memVO = null ;
		}
		
		return memVO;
	}

}
