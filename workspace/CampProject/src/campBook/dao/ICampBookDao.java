package campBook.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CampBookVO;
import vo.PagingVO;

public interface ICampBookDao {
	
	 public List<CampBookVO> getCampBookAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException; //페이지

	 public int getTotalCnt(SqlMapClient smc) throws SQLException;

}
