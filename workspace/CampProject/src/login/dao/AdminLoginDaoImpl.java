package login.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.AdminVO;
import vo.CampHostVO;
import vo.MemVO;

public class AdminLoginDaoImpl implements IAdminLoginDao{
	
	//1)
	private static IAdminLoginDao adminLoginDao;
	
	//2)
	private AdminLoginDaoImpl() {
	}
	
	//3)
	public static IAdminLoginDao getInstance() {
		if(adminLoginDao == null) {
			adminLoginDao = new AdminLoginDaoImpl();
		}
		return adminLoginDao;
	}
	

	@Override
	public AdminVO checkAdmin(SqlMapClient smc, String adminId, String adminPW) throws SQLException {
		
		AdminVO adminVO = (AdminVO) smc.queryForObject("adminLogin.chkAdmin", adminId);
		return  adminVO;
		
	}

	@Override
	public boolean checkAdminPW(SqlMapClient smc, String adminPW) throws SQLException {
		
		boolean chk = false;
		List<AdminVO> adminVO = null;
		
		adminVO = smc.queryForList("adminLogin.chkAdminByAdminPw", adminPW);
		
		if(adminVO != null && adminVO.size() != 0) {
			chk = true;
		}
		
		return chk;
		
	}

	@Override
	public AdminVO getAdminVO(SqlMapClient smc, AdminVO adminVO) throws SQLException {
		
		Object obj =  smc.queryForObject("adminLogin.chkAdminByAdminId", adminVO);
		
		if(obj == null) {
			adminVO = null ;
		}
		
		return adminVO;
	}

	
}
