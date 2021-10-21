package campBook.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import campBook.dao.CampBookDao;
import campBook.dao.ICampBookDao;
import event.service.EventServiceImpl;
import event.service.IEventService;
import util.SqlMapClientFactory;
import vo.CampBookVO;
import vo.PagingVO;

public class CampBookService implements ICampBookService{
	
	private ICampBookDao campBookDao;
	 
	private static ICampBookService campBookService;
	
	private SqlMapClient smc;
	
	private  CampBookService() {
		campBookDao = CampBookDao.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ICampBookService getInstance() {
		
		if(campBookService == null) {
			campBookService = new CampBookService();
		}
		
		return campBookService;
	}

	@Override
	public List<CampBookVO> getCampBookAll(PagingVO pagingVO) {

		List<CampBookVO> campBookList = new ArrayList<CampBookVO>();
		
		try {
			campBookList = campBookDao.getCampBookAll(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return campBookList;
	}

	@Override
	public int getTotalCnt() {
	
		int cnt = 0;
		
		try {
			cnt = campBookDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}

}
