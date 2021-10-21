package campMangage.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampHostVO;
import vo.PagingVO;

public interface ICampManageDao {
	
	/**
	 * 주어진 회원ID가 존재하는지 여부를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 해당 회원ID가 있으면 true, 없으면 false
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public boolean checkCamping (SqlMapClient smc, String memId) throws SQLException;

	/**
	 * 전체 회원수를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @return 전체 회원수
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public int getTotalCnt(SqlMapClient smc) throws SQLException;
	
	/**
	 * DB의 mymember테이블 전체 레코드를 가져와서 List에 담아 반환하는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param pagingVO 페이징 정보를 담고 있는 객체
	 * @return MemberVO객체를 담고 있는 List객체
	 * @throws SQLException JDBC관련 예외객체
	 */
	public List<CampHostVO> getAllCampingList(SqlMapClient smc, PagingVO pagingVO) throws SQLException;


	public int updateCamping(SqlMapClient smc, CampHostVO cv) throws SQLException;
	
	
	/**
	 * 회원정보를 검색하기 위한 메서드
	 * @param smc SqlMapCliet 객체
	 * @param cv 검색할 회원 정보
	 * @return 검색된 회원정보를 담은 List객체
	 * @throws SQLException JDBC관련 예외객체 
	 */
	public List<CampHostVO> getSearchCamping(SqlMapClient smc, CampHostVO cv) throws SQLException;
	
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public CampHostVO getCamping (SqlMapClient smc, String memId) throws SQLException;
}
