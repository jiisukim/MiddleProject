package join.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import vo.CampHostVO;

public interface IHostjoinDao{

	/**
	 * 주어진 캠프호스트id의 존재여부를 알아내는 메서드
	 * @param smc sqlmapclient객체
	 * @param cmpId 검색할 캠프호스트id
	 * @return	해당 id가 있으면 true, 없으면 false
	 * @throws SqlMapException jdbc관련 예외 객체
	 */
	public boolean checkCampId(SqlMapClient smc ,String cmpId)throws SQLException;
	
	
	
	/**
	 * 주어진 캠프호스트닉네임의 존재여부를 알아내는 메서드
	 * @param smc sqlmapclient객체
	 * @param cmpNick 검색할 캠프호스트 닉네임
	 * @return 해당 닉네임이 있으면 true, 없으면 false
	 * @throws SqlMapException jdbc관련 예외 객체 
	 */
	public boolean checkCampNick(SqlMapClient smc,String cmpNick)throws SQLException;
	
	/**
	 * CampHostVO에 담겨진 자료를 camphost테이블에 insert하는 메서드
	 * @param smc sqlmapclient객체
	 * @param camphost 입력할 CampHostVO객체
	 * @return selectkey과정에서 조회된 값
	 * @throws SQLException jdbc관련 예외 객체 
	 */
	public int insertCamphost(SqlMapClient smc, CampHostVO camphost)throws SQLException;
	
	/**
	 * CampHostVO에 담겨진 자료를 campact테이블에 insert하는 메서드
	 * @param smc
	 * @param camphost
	 * @return
	 * @throws SQLException
	 */
	public int insertCampact(SqlMapClient smc, CampHostVO camphost)throws SQLException;
	
	/**
	 * CampHostVO에 담겨진 자료를 campthm테이블에 insert하는 메서드
	 * @param smc
	 * @param camphost
	 * @return
	 * @throws SQLException
	 */
	public int insertCampthm(SqlMapClient smc, CampHostVO camphost)throws SQLException;
	
	
}
