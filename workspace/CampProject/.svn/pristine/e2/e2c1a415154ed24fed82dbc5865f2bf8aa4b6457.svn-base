package login.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import login.dao.HostLoginDaoImpl;
import login.dao.IHostLoginDao;
import login.dao.IUserLoginDao;
import login.dao.UserLoginDaoImpl;
import util.SqlMapClientFactory;
import vo.CampHostVO;
import vo.MemVO;

public class HostServiceImpl implements IHostLoginService{

	private SqlMapClient smc;
	private IHostLoginDao hostLoginDao;
	
	private static IHostLoginService hostLoginService;
	
	private HostServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		hostLoginDao = HostLoginDaoImpl.getInstance();
		
	}
	
	public static IHostLoginService getInstance() {
		if(hostLoginService == null) {
			hostLoginService = new HostServiceImpl();
		}
		return hostLoginService;
	}

	@Override
	public CampHostVO checkHost(String hostId, String hostPw) {
		
		CampHostVO hostVO = null;
		
		try {
			hostVO = hostLoginDao.checkHost(smc, hostId, hostPw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return hostVO;
	}

	@Override
	public boolean checkHostPW(String hostPw) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CampHostVO getHostVO(CampHostVO hostVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
