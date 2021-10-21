package campingCrud.service;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampHostVO;
import vo.NoticeVO;


public interface ICampingService {
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 조회하는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당ID에 해당하는 회원정보
	 */
	public CampHostVO getCamping(String cmpId);

	
	/**
	 * 하나의 공지사항 DB에 update하는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param nv update할 회원 정보가 들어있는 NoticeVO객체
	 * @return DB작업이 성공하면 1이상의 값이 반환되고, 실패하면 0이반환된다.
	 * @throws SQLException 예외객체
	 */
	public int updateCamping(CampHostVO cv) throws SQLException;
	
	
	/**
	 * 주어진 공지번호에 해당하는 회원정보를 알아내는 메서드
	 * @param smc SqlMapCliet 객체
	 * @param ntcCode 공지번호
	 * @return 공지번호를 담은 NoticeVO객체
	 * @throws SQLException 예외객체
	 */
	public int deleteCamping(String cmpCode) throws SQLException;
}
