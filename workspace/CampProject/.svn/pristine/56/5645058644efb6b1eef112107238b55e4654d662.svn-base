package campRev.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.PagingVO;
import vo.ViewRevVo;

public interface ICampRevDao {
	
	/**
	 * 해당 캠핑장의 리뷰들을 페이징처리해주는 메서드
	 * @param smc				SqlMapClient
	 * @return					캠핑장 리뷰 전체 갯수
	 * @throws SQLException		jdbc관련 예외 객체
	 */
	public int getTotalCnt(SqlMapClient smc) throws SQLException;   //페이징처리
	
	/**
	 * 해당 캠핑장의 리뷰들을 목록으로 보여주는 메서드
	 * @param smc				SqlMapClient
	 * @param pagingVO			ViewRevVo 전체 리스트를 담은 pagingVO객체
	 * @return					QnaVO객체를 담고 있는 List객체
	 * @throws SQLException		jdbc관련 예외 객체		
	 */
	public List<ViewRevVo> getCampRevAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException; //페이지

}
