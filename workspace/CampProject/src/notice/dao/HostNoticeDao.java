package notice.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.NoticeVO;
import vo.PagingVO;

public class HostNoticeDao implements IHostNoticeDao{
	private static IHostNoticeDao noticeDao;
	
	private HostNoticeDao() {}
	
	public static IHostNoticeDao getInstance() {
		if(noticeDao == null) {
			noticeDao = new HostNoticeDao();
		}
		return noticeDao;
	}
	
	
	
	@Override
	public int insertNotice(SqlMapClient smc, NoticeVO nv) throws SQLException {
		int cnt = 0;
		
		Object obj = smc.insert("hostNotice.insertNotice",nv);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public List<NoticeVO> getNoticeAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		List<NoticeVO> noticeList = smc.queryForList("hostNotice.getNoticeAll",pagingVO);
		return noticeList;
	}

	@Override
	public int updateNotice(SqlMapClient smc, NoticeVO nv) throws SQLException {
		int cnt = smc.update("hostNotice.updateNotice", nv);
		return cnt;
	}

	@Override
	public int deleteNotice(SqlMapClient smc, String ntcCode) throws SQLException {
		int cnt = smc.delete("hostNotice.deleteNotice", ntcCode);
		return cnt;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer)smc.queryForObject("hostNotice.getTotalCnt");
		return cnt;
	}

	@Override
	public NoticeVO getNotice(SqlMapClient smc, String ntcCode) throws SQLException {
		NoticeVO nv = (NoticeVO)smc.queryForObject("hostNotice.getNotice", ntcCode);
		
		return nv;
	}

	@Override
	public List<NoticeVO> searchNotice(SqlMapClient smc, String ntcTitle) throws SQLException {
		List<NoticeVO> noticeList = smc.queryForList("hostNotice.searchNotice",ntcTitle);
		
		return noticeList;
	}

}
