package campingCrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampHostVO;
import vo.NoticeVO;

public interface ICampingDao {
	//수정, 삭제 , 조회


	
	/**
	 * 하나의 공지사항 DB에 update하는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param nv update할 회원 정보가 들어있는 NoticeVO객체
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외객체
	 */
	public int updateCamping(SqlMapClient smc, CampHostVO cv) throws SQLException;
	
	
	/**
	 * 주어진 공지번호에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param ntcCode 공지번호
	 * @return 공지번호를 담은 NoticeVO객체
	 * @throws SQLException 예외객체
	 */
	public int deleteCamping(SqlMapClient smc, String cmpCode) throws SQLException;
	
	
	public CampHostVO getCamping(SqlMapClient smc, String cmpId) throws SQLException;
	
}
