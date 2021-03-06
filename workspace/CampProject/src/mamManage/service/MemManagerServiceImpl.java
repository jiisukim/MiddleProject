package mamManage.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import mamManage.dao.IMemManagerDao;
import mamManage.dao.MemManagerDaoImpl;
import util.SqlMapClientFactory;
import vo.MemVO;
import vo.PagingVO;

public class MemManagerServiceImpl implements IMemManagerService {

	private IMemManagerDao memManageDao;
	
	private static IMemManagerService memManageService;
	
	private SqlMapClient smc;
	
	private MemManagerServiceImpl() {
		memManageDao = MemManagerDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IMemManagerService getInstance() {
		
		if(memManageService == null) {
			memManageService = new MemManagerServiceImpl();
		}
		
		return memManageService;
	}

	@Override
	public List<MemVO> getSearchMember(MemVO mv) {
		List<MemVO> memList = new ArrayList();
		
		try {
			memList = memManageDao.getSearchMember(smc, mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memList;
	}

	@Override
	public MemVO getMember(String memId) {
		MemVO mv = null;
		try {
			mv = memManageDao.getMember(smc, memId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mv;
	}

	@Override
	public List<MemVO> getAllMemberList(PagingVO pagingVO) {
		List<MemVO> memList = new ArrayList<MemVO>();
		
		try {
			memList = memManageDao.getAllMemberList(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memList;
	}

	@Override
	public int getTotalCnt() {
		int cnt = 0;
		
		try {
			cnt = memManageDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}
}
