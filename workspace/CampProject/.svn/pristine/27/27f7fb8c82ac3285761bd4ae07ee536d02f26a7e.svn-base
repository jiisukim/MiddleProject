package pay.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampBookVO;
import vo.CampHostVO;

public interface IPayDao {

	/**
	 * 주어진 cmpCode로 상세정보를 조회하는 메서드
	 * @param smc sqlmapclient객체
	 * @param cmpCode 검색할 캠핑업체코드
	 * @return	조회된 CampHostVO객체
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public CampHostVO searchCampHost(SqlMapClient smc, String cmpCode)throws SQLException;
	
	/**
	 * CampBookVO에 정보를 담아 campbook테이블에 데이터를 삽입하는 메서드
	 * @param smc sqlmapclient객체
	 * @param campbook 입력할 CampBookVO객체
	 * @return selectkey실행 결과값(1이상의 값)
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int insertCampbook(SqlMapClient smc,CampBookVO campbook)throws SQLException;
	
}
