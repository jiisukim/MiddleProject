package qna.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.EventVO;
import vo.PagingVO;
import vo.QnaVO;

public class QnaDaoImpl implements IQnaDao{
	
	private static IQnaDao qnaDao; //멤버변수 생성
	
	private QnaDaoImpl() { // 싱글턴 패턴으로 만들기 위해 생성자를 private으로 감춤
	}
	
	public static IQnaDao getInstance() {
		if(qnaDao == null) {
			qnaDao = new QnaDaoImpl();
		}
		return qnaDao;
	}

	@Override
	public int insertQna(SqlMapClient smc, QnaVO qnaVO) throws SQLException {
		 int cnt = 0;
	      
	      Object obj = smc.insert("qna.insertQna", qnaVO);
	      
//	      sqlSession.insert(namespace + ".insertMember", vo);
	      
	      if(obj == null) {
	         cnt = 1;
	      }
	      
	      return cnt;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {
		int cnt = (Integer)smc.queryForObject("qna.getTotalCnt");
	    return cnt;
	}

	@Override
	public List<QnaVO> getQnaAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
		 List<QnaVO> qnaList = smc.queryForList("qna.getQnaAll", pagingVO);
	     return qnaList;
	}

	@Override
	public int updateQna(SqlMapClient smc, QnaVO qnaVO) throws SQLException {
		int cnt = smc.update("qna.updateQna", qnaVO);
	    return cnt;
	}

	@Override
	public int deleteQna(SqlMapClient smc, String qnaCode) throws SQLException {
		int cnt = smc.delete("qna.deleteQna", qnaCode);
	    return cnt;
	}

	@Override
	public QnaVO getQna(SqlMapClient smc, String qnaCode) throws SQLException {
		QnaVO qnaVO = (QnaVO)smc.queryForObject("qna.getQna", qnaCode);
		return qnaVO;
	}

	@Override
	public String getMemNick(SqlMapClient smc, QnaVO qnaVO) throws SQLException {
		String memNick = (String) smc.queryForObject("qna.getMemNick", qnaVO);
		
		return memNick;
	}

}
