package qna.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.QnaVO;
import vo.PagingVO;
import vo.QnaVO;

public interface IQnaDao {
	
	/**
	 * QNA를 등록하는 메서드
	 * @param smc				SqlMapClient객체
	 * @param qnaVO				등록할 QNA의 VO객체
	 * @return					성공하면 1, 실패하면 0
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public int insertQna(SqlMapClient smc, QnaVO qnaVO) throws SQLException;      //등록
    
	/**
	 * QNA 게시글들을 페이징 처리해주는 메서드
	 * @param smc				SqlMapClient
	 * @return					전체 QNA갯수
	 * @throws SQLException		jdbc관련 예외 객체
	 */
    public int getTotalCnt(SqlMapClient smc) throws SQLException;   //페이징처리
    
    /**
     * 
     * @param smc				SqlMapClient
     * @param pagingVO			QnaVO 전체 리스트를 담은 pagingVO객체
     * @return					QnaVO객체를 담고 있는 List객체
     * @throws SQLException		jdbc관련 예외 객체
     */
    public List<QnaVO> getQnaAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException; //페이지

    /**
     * QNA 게시글을 수정하는 메서드
     * @param smc				SqlMapClient
     * @param qnaVO				수정할 QNA의 VO객체
     * @return					성공하면 1, 실패하면 0
     * @throws SQLException		jdbc관련 예외 객체
     */
    public int updateQna(SqlMapClient smc, QnaVO qnaVO) throws SQLException;   //업데이트
    
    /**
     * QNA 게시글을 삭제하는 메서드
     * @param smc				SqlMapClient
     * @param qnaCode			삭제할 QNA의 코드 번호
     * @return					성공하면 1, 실패하면 0
     * @throws SQLException		jdbc관련 예외 객체
     */
    public int deleteQna(SqlMapClient smc, String qnaCode) throws SQLException;   //삭제
    
    /**
     * Qna번호로 게시글을 조회하는 메서드
     * @param smc				SqlMapClient
     * @param qnaCode			조회할 QNA의 코드 번호
     * @return					성공하면 1, 실패하면 0
     * @throws SQLException		jdbc관련 예외 객체
     */
    public QnaVO getQna(SqlMapClient smc, String qnaCode) throws SQLException;   //주어진 코드로 정보 조회
    
    /**
     * 
     * @param smc
     * @param qnaVO
     * @return
     * @throws SQLException
     */
    public String getMemNick(SqlMapClient smc, QnaVO qnaVO)throws SQLException;

}
