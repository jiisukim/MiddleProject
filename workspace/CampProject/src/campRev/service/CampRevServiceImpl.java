package campRev.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import campRev.dao.CampRevDaoImpl;
import campRev.dao.ICampRevDao;
import util.SqlMapClientFactory;
import vo.PagingVO;
import vo.ViewRevVo;

public class CampRevServiceImpl implements ICampRevService{
	
	
	private ICampRevDao revDao;
	
	private SqlMapClient smc;
	
	private static ICampRevService revService;
	
	private CampRevServiceImpl() {
		revDao = CampRevDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static ICampRevService getInstance( ) {
		if(revService == null) {
			revService = new CampRevServiceImpl();
		}
		
		return revService;
	}

	@Override
	public List<ViewRevVo> getRevAll(PagingVO pagingVO) {
		
		List<ViewRevVo> revList = new ArrayList<ViewRevVo>();
		try {
			revList = revDao.getCampRevAll(smc, pagingVO);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return revList;
	}

	@Override
	public int getTotalCnt() {
		
		int cnt = 0;
		
		try {
			cnt = revDao.getTotalCnt(smc);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnt;
	}

}
