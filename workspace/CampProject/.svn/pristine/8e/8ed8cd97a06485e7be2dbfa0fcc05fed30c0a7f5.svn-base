package login.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import login.dao.AdminLoginDaoImpl;
import login.dao.HostLoginDaoImpl;
import login.dao.IAdminLoginDao;
import login.dao.IHostLoginDao;
import login.dao.IUserLoginDao;
import login.dao.UserLoginDaoImpl;
import util.SqlMapClientFactory;
import vo.AdminVO;
import vo.CampHostVO;
import vo.MemVO;

public class AdminLoginServiceImpl implements IAdminLoginService{

	private SqlMapClient smc;
	private IAdminLoginDao adminLoginDao;
	
	private static IAdminLoginService adminLoginService;
	
	private AdminLoginServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		adminLoginDao = AdminLoginDaoImpl.getInstance();
		
	}
	
	public static IAdminLoginService getInstance() {
		if(adminLoginService == null) {
			adminLoginService = new AdminLoginServiceImpl();
		}
		return adminLoginService;
	}

	@Override
	public AdminVO checkAdmin(String adminId, String adminPw) {

		AdminVO adminVO = null;
		
		try {
			adminVO = adminLoginDao.checkAdmin(smc, adminId, adminPw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return adminVO;
		
	}

	@Override
	public boolean checkAdminPW(String adminPw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AdminVO getAdminVO(AdminVO adminVO) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
