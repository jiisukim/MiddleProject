package login.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.AdminVO;
import vo.CampHostVO;
import vo.MemVO;

public interface IAdminLoginDao {
	
	/**
	 * 주어진 관리자의 ID 존재 여부를 알아내는 메서드
	 * @param smc 				SqlMapClient객체
	 * @param adminId			검색할 관리자의 ID	
	 * @return					해당 ID가 있으면 AdminVO, 없으면 null을 반환한다.
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public AdminVO checkAdmin(SqlMapClient smc, String adminId, String adminPW)throws SQLException;
	

	/**
	 * 주어진 관리자의 PW존재여부를 알아내는 메서드
	 * @param smc				SqlMapClient객체
	 * @param adminPW			검색할 관리자의 PW
	 * @return					해당 PW가 있으면 true, 없으면 false
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public boolean checkAdminPW(SqlMapClient smc, String adminPW)throws SQLException;
	
	/**
	 * 주어진 관리자의 정보를 db에서 가져와 MemVO객체에 담는 메서드
	 * @param smc				SqlMapClient객체
	 * @param adminVO				db에서 가져온 자료가 저장된 AdminVO객체
	 * @return					자료가 있으면 AdminVO, 없으면 null을 반환
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public AdminVO getAdminVO(SqlMapClient smc, AdminVO adminVO) throws SQLException;
	
	
}
