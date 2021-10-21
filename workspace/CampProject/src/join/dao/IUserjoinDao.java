package join.dao;

import java.sql.SQLException;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapException;

import vo.MemVO;

public interface IUserjoinDao {

	/**
	 * 주어진 회원id의 존재여부를 알아내는 메서드
	 * @param smc sqlmapclient객체
	 * @param memId 검색할 회원id
	 * @return 해당 id가 있으면 true, 없으면 false
	 * @throws SqlMapException jdbc관련 예외 객체
	 */
	public boolean checkMemId(SqlMapClient smc, String memId)throws SQLException;
	
	
	/**
	 * 주어진 회원닉네임의 존재여부를 알아내는 메서드
	 * @param smc sqlmapclient객체
	 * @param memNick 검색할 회원닉네임
	 * @return 해당 닉네임이 있으면 true, 없으면 false
	 * @throws SqlMapException jdbc관련 예외 객체
	 */
	public boolean checkMemNick(SqlMapClient smc, String memNick)throws SQLException;
	
	
	/**
	 * MemVO에 담겨진 자료를 db에 insert하는 메서드
	 * @param smc sqlmapclient객체
	 * @param member 입력할 MemVO객체
	 * @return db작업에 성공하면 1, 실패하면 0
	 * @throws SqlMapException SQLException jdbc관련 예외 객체
	 */
	public int insertMember(SqlMapClient smc, MemVO member)throws SQLException;
}
