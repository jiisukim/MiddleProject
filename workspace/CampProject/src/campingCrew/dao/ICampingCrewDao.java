package campingCrew.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CrewActVO;
import vo.CrewThmVO;
import vo.CrewVO;
import vo.CrewreplyVO;
import vo.MemVO;
import vo.RecCrewVO;
import vo.RecCrewVO2;

public interface ICampingCrewDao {
	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertCrewMake(SqlMapClient smc, RecCrewVO rv) throws SQLException;

	
	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertCrewMakeAct(SqlMapClient smc, CrewActVO cav) throws SQLException;
	
	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertCrewMakeThm(SqlMapClient smc, CrewThmVO ctm) throws SQLException;
	
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public RecCrewVO getCrew(SqlMapClient smc, String crewCode) throws SQLException;
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public CrewActVO getCrewAct(SqlMapClient smc, String crewCode) throws SQLException;
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public CrewThmVO getCrewThm(SqlMapClient smc, String crewCode) throws SQLException;
	
	/**
	 * 크루코드중 가장 높은 크루코드
	 * @param smc SqlMapCliet 객체
	 * @return 전체 회원수
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public int maxCrewCode(SqlMapClient smc) throws SQLException;
	
	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public List<RecCrewVO2> checkCrewCtgr(SqlMapClient smc, RecCrewVO2 rv) throws SQLException;

	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public RecCrewVO2 crewInfo(SqlMapClient smc, String crewCode) throws SQLException;
	

	
	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertCrewMember(SqlMapClient smc, CrewVO cv) throws SQLException;
	

	/**
	 * 하나의 공지사항 DB에 update하는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param nv update할 회원 정보가 들어있는 NoticeVO객체
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외객체
	 */
	public int updateCrew(SqlMapClient smc, RecCrewVO rv) throws SQLException;
	
	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public List<RecCrewVO2> crewInfoMemCode(SqlMapClient smc, RecCrewVO2 rv) throws SQLException;
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param memId 검색할 회원ID
	 * @return 회원정보를 담은 MemberVO객체
	 * @throws SQLException JDBC관련 예외 객체
	 */
	public MemVO getUserIdByMemCode(SqlMapClient smc, String memCode) throws SQLException;
	
	/**
	 * NoticeVO nv에 담겨진 자료를 DB에 insert하는 메서드
	 * @param smc SqlMapClient 객체
	 * @param nv DB에 insert할 자료가 저장된 회원정보
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외 객체
	 */
	public int insertRply(SqlMapClient smc, CrewreplyVO crv) throws SQLException;
	
	
	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public List<CrewreplyVO> crewRplyChk(SqlMapClient smc, String crewCode) throws SQLException;
	
	
	/**
	 * DB의 TB_NOTICE 전체 출력
	 * @param smc SqlMapCliet 객체
	 * @return NoticeVO객체를 담고 있는 List객체
	 * @throws SQLException 예외 객체
	 */
	public MemVO myInfoSel(SqlMapClient smc, String memCode) throws SQLException;
}
