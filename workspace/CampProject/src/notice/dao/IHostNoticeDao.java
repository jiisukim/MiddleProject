package notice.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.NoticeVO;
import vo.PagingVO;

public interface IHostNoticeDao {

	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertNotice(SqlMapClient smc, NoticeVO nv) throws SQLException;
	
	
	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public List<NoticeVO> getNoticeAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException;
	
	
	/**
	 * 하나의 공지사항 DB에 update하는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param nv update할 회원 정보가 들어있는 NoticeVO객체
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외객체
	 */
	public int updateNotice(SqlMapClient smc, NoticeVO nv) throws SQLException;
	
	
	/**
	 * 주어진 공지번호에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param ntcCode 공지번호
	 * @return 공지번호를 담은 NoticeVO객체
	 * @throws SQLException 예외객체
	 */
	public int deleteNotice(SqlMapClient smc, String ntcCode) throws SQLException;
	
	/**
	 * 전체 회원수를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @return 전체 회원수
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public int getTotalCnt(SqlMapClient smc) throws SQLException;
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public NoticeVO getNotice(SqlMapClient smc, String ntcCode) throws SQLException;
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public List<NoticeVO> searchNotice(SqlMapClient smc, String ntcTitle) throws SQLException; 
}
