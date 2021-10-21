package comm.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.AtFileVO;
import vo.CampHostVO;


public class AtchFileDaoImpl implements IAtchFileDao{

	private static IAtchFileDao dao;
	
	private AtchFileDaoImpl() {
		
	}
	
	public static IAtchFileDao getInstance() {
		if(dao == null) {
			dao = new AtchFileDaoImpl();
		}
		return dao;
	}

	@Override
	public long insertAtchFile(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException {
		long cnt =0;
		Object obj = smc.insert("atFile.insertAtFile", atchFileVO);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public long insertAtchFileDetail(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException {
		long cnt = 0;
		
		Object obj = smc.insert("atFile.insertAtFileDetail", atchFileVO);
		if(obj == null) {
			cnt = 1;
		}		
		return cnt;
	}

	@Override
	public List<AtFileVO> getAtchFileList(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException {
		List<AtFileVO> atchFileList = smc.queryForList("atFile.getAtFileList", atchFileVO);
		return atchFileList;
	}

	@Override
	public AtFileVO getAtchfileDetail(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException {
		AtFileVO fileVO = (AtFileVO)smc.queryForObject("atFile.getAtFileDetail", atchFileVO);
		
		return fileVO;
	}

	@Override
	public int insertCmpImg(SqlMapClient smc, CampHostVO camphost) throws SQLException {
		
		int cnt = 0;
		Object obj = (Integer)smc.insert("atFile.insertCmpImg",camphost);
		
		if(obj == null) {
			cnt = 1 ;
		}
		
		return cnt;
		
	}
	
	

}
