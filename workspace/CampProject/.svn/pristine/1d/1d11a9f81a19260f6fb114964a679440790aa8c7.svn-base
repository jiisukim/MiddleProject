package campBook.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import event.dao.EventDaoImpl;
import event.dao.IEventDao;
import vo.CampBookVO;
import vo.PagingVO;

public class CampBookDao implements ICampBookDao {

	   private static ICampBookDao campBookDao;
	      
	      private CampBookDao() {}
	      
	      public static ICampBookDao getInstance() {
	         if(campBookDao == null) {
	        	 campBookDao = new CampBookDao();
	         }
	         return campBookDao;
	      }

	@Override
	public List<CampBookVO> getCampBookAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {

		 List<CampBookVO> campBookList = smc.queryForList("campBook.getCampBookAll", pagingVO);
	      
	      
	     return campBookList;
	}

	@Override
	public int getTotalCnt(SqlMapClient smc) throws SQLException {

	      int cnt = (Integer)smc.queryForObject("campBook.getTotalCnt");
	      return cnt;
	}

}
