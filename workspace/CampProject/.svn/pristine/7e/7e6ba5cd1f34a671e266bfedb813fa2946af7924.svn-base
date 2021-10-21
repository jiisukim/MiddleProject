package join.service;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import join.dao.IUserjoinDao;
import join.dao.UserjoinDaoImpl;
import util.SqlMapClientFactory;
import vo.MemVO;

public class UserjoinServiceImpl implements IUserjoinService{

	private SqlMapClient smc;
	
	private IUserjoinDao userjoinDao;
	
	private static IUserjoinService userjoinService;
	
	private UserjoinServiceImpl() {
		smc = SqlMapClientFactory.getInstance();
		userjoinDao = UserjoinDaoImpl.getInstance();
		
	}
	
	public static IUserjoinService getInstance() {
		if(userjoinService == null) {
			userjoinService = new UserjoinServiceImpl();
		}
		return userjoinService;
	}
	
	
	@Override
	public boolean checkMemId(String memId) {
		boolean check = false;
		
		try {
			check = userjoinDao.checkMemId(smc, memId);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return check;
	}

	@Override
	public boolean checkMemNick(String memNick) {
		boolean check = false;
		
		try {
			check = userjoinDao.checkMemNick(smc, memNick);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return check;
	}

	@Override
	public int insertMember(MemVO member) {
		int cnt = 0;
		
		try {
			cnt = userjoinDao.insertMember(smc, member);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return cnt;
	}

}
