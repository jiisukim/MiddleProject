package login.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampHostVO;
import vo.MemVO;

public class HostLoginDaoImpl implements IHostLoginDao{
	
	//1)
	private static IHostLoginDao hostLoginDao;
	
	//2)
	private HostLoginDaoImpl() {
	}
	
	//3)
	public static IHostLoginDao getInstance() {
		if(hostLoginDao == null) {
			hostLoginDao = new HostLoginDaoImpl();
		}
		return hostLoginDao;
	}
	

	@Override
	public CampHostVO checkHost(SqlMapClient smc, String hostId, String hostPW) throws SQLException {
		
		CampHostVO hostvo = (CampHostVO) smc.queryForObject("hostLogin.chkHost", hostId);
		return  hostvo;
	}

	@Override
	public boolean checkHostPW(SqlMapClient smc, String hostPW) throws SQLException {
		boolean chk = false;
		List<CampHostVO> hostvo = null;
		
		hostvo = smc.queryForList("hostLogin.chkHostByHostPw", hostPW);
		
		if(hostvo != null && hostvo.size() != 0) {
			chk = true;
		}
		
		return chk;
	}

	@Override
	public CampHostVO getHostVO(SqlMapClient smc, CampHostVO hostVO) throws SQLException {
		Object obj =  smc.queryForObject("hostLogin.chkHostByHostId", hostVO);
		
		if(obj == null) {
			hostVO = null ;
		}
		
		return hostVO;
	}

}
