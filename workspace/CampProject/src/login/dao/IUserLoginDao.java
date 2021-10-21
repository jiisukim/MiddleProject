package login.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.MemVO;

public interface IUserLoginDao {
	
	/**
	 * 주어진 사용자 또는 관리자의 ID 존재 여부를 알아내는 메서드
	 * @param smc 				SqlMapClient객체
	 * @param userId			검색할 사용자 또는 관리자의 ID	
	 * @return					해당 ID가 있으면 VO, 없으면 null을 반환한다.
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public MemVO checkUser(SqlMapClient smc, String userId, String userPW)throws SQLException;
	

	/**
	 * 주어진 사용자 또는 관리자의 PW존재여부를 알아내는 메서드
	 * @param smc				SqlMapClient객체
	 * @param userPW			검색할 사용자 또는 관리자의 PW
	 * @return					해당 PW가 있으면 true, 없으면 false
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public boolean checkUserPW(SqlMapClient smc, String userPW)throws SQLException;
	
	/**
	 * 주어진 사용자의 정보를 db에서 가져와 MemVO객체에 담는 메서드
	 * @param smc				SqlMapClient객체
	 * @param memVO				db에서 가져온 자료가 저장된 MemVO객체
	 * @return					자료가 있으면 MemVO, 없으면 null을 반환
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public MemVO getmemVO(SqlMapClient smc, MemVO memVO) throws SQLException;
	
	
}
