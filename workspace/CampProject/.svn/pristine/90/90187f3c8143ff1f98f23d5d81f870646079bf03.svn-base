package faq.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.FaqVO;
import vo.PagingVO;

public interface IFaqDao {

	/**
	 * FaqVO객체 담겨진 자료를 db에 insert하는 메서드
	 * @param smc sqlmapclient 객체
	 * @param faq db에 insert할 자료가 저장된 게시글정보
	 * @return db작업이 성공하면 1, 실패하면 0
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int insertFaq(SqlMapClient smc, FaqVO faq)throws SQLException;
	
	/**
	 * TB_FAQ테이블 전체의 레코드를 가져와 pagevo에 담긴 설정대로 list를 반환하는 메서드
	 * @param smc sqlmapclient 객체
	 * @param pagevo pagingvo 객체
	 * @return
	 * @throws SQLException
	 */
	public List<FaqVO> getFaqWithPaging(SqlMapClient smc, PagingVO pagevo)throws SQLException;
	
	/**
	 * 하나의 faq게시물정보를 db에 update하는 메서드
	 * @param smc sqlmapclient 객체
	 * @param faq update할 faq객체
	 * @return db작업이 성공하면 1, 실패하면 0
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int updateFaq(SqlMapClient smc, FaqVO faq)throws SQLException;
	
	/**
	 * faq코드를 매개변수로 받아서 해당 faq게시물을 삭제하는 메서드
	 * @param smc sqlmapclient 객체
	 * @param faqCode 삭제할 faq 게시물코드
	 * @return	db작업이 성공하면 1, 실패하면 0
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int deleteFaq(SqlMapClient smc, String faqCode)throws SQLException;
	
	/**
	 * faq게시글을 검색하기위한 메서드
	 * @param smc sqlmapclient 객체
	 * @param faq 검색할 faq정보
	 * @return 검색된 faq게시글들을 담은 list객체
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public List<FaqVO> getFaqDetail(SqlMapClient smc, FaqVO faq)throws SQLException;
	
	/**
	 * faq게시글을 검색해서 나온 레코드 수를 구하는 메서드
	 * @param smc sqlmapclient 객체
	 * @param faq 검색할 faq정보
	 * @return 검색된 faq게시글들의 전체수
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int getFaqDetailTotalCnt(SqlMapClient smc, FaqVO faq)throws SQLException;
	
	/**
	 * 주어진 faq코드에 해당하는 faq게시물을 알아내는 메서드
	 * @param smc sqlmapclient 객체
	 * @param faqCode 조회할 faq게시물코드
	 * @return	게시글정보를 담은 FaqVO객체
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public FaqVO getFaq(SqlMapClient smc, String faqCode)throws SQLException;
	
	/**
	 * 전체 faq게시글수를 알아내는 메서드
	 * @param smc sqlmapclient 객체
	 * @return 전체 게시글 수 
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public int getTotalCnt(SqlMapClient smc)throws SQLException;
	
	/**
	 * 주어진 admCode로 db에서 admNick을 알아내는 메서드
	 * @param smc sqlmapclient 객체
	 * @param admCode 검색할 관리자코드
	 * @return	검색된 admNick
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public String getAdminNick(SqlMapClient smc,String admCode )throws SQLException;
	
	/**
	 * db에 있는 모든 faq를 불러오는 메서드
	 * @param smc sqlmapclient 객체
	 * @return 모든 faq게시물을 담은 list 객체
	 * @throws SQLException jdbc관련 예외 객체
	 */
	public List<FaqVO> getAllFaq(SqlMapClient smc)throws SQLException;
}
