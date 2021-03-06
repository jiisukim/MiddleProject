package adminCrud.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import adminCrud.dao.AdminDao;
import adminCrud.dao.IAdminDao;
import event.dao.EventDaoImpl;
import event.dao.IEventDao;
import event.service.EventServiceImpl;
import event.service.IEventService;
import mamManage.dao.IMemManagerDao;
import util.SqlMapClientFactory;
import vo.EventVO;
import vo.MemVO;
import vo.PagingVO;

public class AdminService implements IAdminService {
	private IAdminDao memDao;
	 
	private static IAdminService adminService;
	
	private SqlMapClient smc;
	
	private AdminService() {
		memDao = AdminDao.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IAdminService getInstance() {
		
		if(adminService == null) {
			adminService = new AdminService();
		}
		
		return adminService;
	}
	

	@Override
	public List<MemVO> getMemAll(PagingVO pagingVO) {

		List<MemVO> memList = new ArrayList<MemVO>();
		
		try {
			memList = memDao.getMemAll(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return memList;
	}

	@Override
	public int updateMem(MemVO mv) {
	
		int cnt = 0;
		
		try {
			cnt = memDao.updateMem(smc, mv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteMem(String memCode) {

		int cnt = 0;
		
		try {
			cnt = memDao.deleteMem(smc, memCode);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}

	@Override
	public int getTotalCnt() {

		int cnt = 0;
		
		try {
			cnt = memDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}

	@Override
	public MemVO getMem(String memCode) {
		
		MemVO mv = null;
		try {
			mv = memDao.getMem(smc, memCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mv;
	}

}
