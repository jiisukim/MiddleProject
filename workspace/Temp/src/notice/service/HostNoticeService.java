package notice.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import notice.dao.HostNoticeDao;
import notice.dao.IHostNoticeDao;
import util.SqlMapClientFactory;
import vo.NoticeVO;
import vo.PagingVO;

public class HostNoticeService implements IHostNoticeService{

	private IHostNoticeDao hostDao;
	 
	private static IHostNoticeService hostService;
	
	private SqlMapClient smc;
	
	private HostNoticeService() {
		hostDao = HostNoticeDao.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	public static IHostNoticeService getInstance() {
		
		if(hostService == null) {
			hostService = new HostNoticeService();
		}
		
		return hostService;
		
	}
	
	
	@Override
	public int insertNotice(NoticeVO nv) {
		
		int cnt = 0;
		
		try {
			cnt = hostDao.insertNotice(smc, nv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<NoticeVO> getNoticeAll(PagingVO pagingVO) {
		List<NoticeVO> hostList = new ArrayList<NoticeVO>();
		
		try {
			hostList = hostDao.getNoticeAll(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return hostList;
	}

	@Override
	public int updateNotice(NoticeVO nv) {
		int cnt = 0;
		
		try {
			cnt = hostDao.updateNotice(smc, nv);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteNotice(String ntcCode) {
		int cnt = 0;
		
		try {
			cnt = hostDao.deleteNotice(smc, ntcCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int getTotalCnt() {
		int cnt = 0;
		
		try {
			cnt = hostDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}
	@Override
	public NoticeVO getNotice(String ntcCode) {
		NoticeVO nv = null;
		try {
			nv = hostDao.getNotice(smc, ntcCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}
	@Override
	public NoticeVO searchNotice(String ntcTitle) {
		NoticeVO nv = null;
		try {
			nv = hostDao.searchNotice(smc, ntcTitle);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nv;
	}

}
