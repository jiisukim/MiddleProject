package login.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import login.dao.IUserLoginDao;
import login.dao.UserLoginDaoImpl;
import util.SqlMapClientFactory;
import vo.MemVO;

public class UserLoginServiceImpl implements IUserLoginService{

	private SqlMapClient smc;
	private IUserLoginDao userLoginDao;
	
	private static IUserLoginService userLoginService;
	
	private UserLoginServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		userLoginDao = UserLoginDaoImpl.getInstance();
		
	}
	
	public static IUserLoginService getInstance() {
		if(userLoginService == null) {
			userLoginService = new UserLoginServiceImpl();
		}
		return userLoginService;
	}

	@Override
	public MemVO checkUser(String userId, String userPw) {
		
		MemVO mVO = null;
		
		try {
			mVO = userLoginDao.checkUser(smc, userId, userPw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mVO;
	}

	@Override
	public boolean checkUserPW(String userPW) {
		
		
		
		
		return false;
	}

	@Override
	public MemVO getmemVO(MemVO memVO) {
		return null;
	}

}
