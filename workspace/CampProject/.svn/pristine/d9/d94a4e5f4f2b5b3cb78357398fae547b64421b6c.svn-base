package campingCrew.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.CrewActVO;
import vo.CrewThmVO;
import vo.CrewVO;
import vo.CrewreplyVO;
import vo.MemVO;
import vo.RecCrewVO;
import vo.RecCrewVO2;

public class CampingCrewDaoImpl implements ICampingCrewDao{
	private static ICampingCrewDao camCrewDao;
	
	private CampingCrewDaoImpl() {}
	
	public static ICampingCrewDao getInstance() {
		if(camCrewDao == null) {
			camCrewDao = new CampingCrewDaoImpl();
		}
		return camCrewDao;
	}
	
	
	@Override
	public int insertCrewMake(SqlMapClient smc, RecCrewVO rv) throws SQLException {
		int cnt = 0;

		Object obj = smc.insert("campingCrew.insertCrewMake",rv);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public int insertCrewMakeAct(SqlMapClient smc, CrewActVO cav) throws SQLException {
		int cnt = 0;

		Object obj = smc.insert("campingCrew.insertCrewMakeAct",cav);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public int insertCrewMakeThm(SqlMapClient smc, CrewThmVO ctm) throws SQLException {
		int cnt = 0;

		Object obj = smc.insert("campingCrew.insertCrewMakeThm",ctm);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public RecCrewVO getCrew(SqlMapClient smc, String crewCode) throws SQLException {
		RecCrewVO rv = (RecCrewVO)smc.queryForObject("campingCrew.getCrew", crewCode);
		
		return rv;
	}
	@Override
	public CrewActVO getCrewAct(SqlMapClient smc, String crewCode) throws SQLException {
		CrewActVO cav = (CrewActVO)smc.queryForObject("campingCrew.getCrewAct", crewCode);
		
		return cav;
	}

	@Override
	public CrewThmVO getCrewThm(SqlMapClient smc, String crewCode) throws SQLException {
		CrewThmVO ctv = (CrewThmVO)smc.queryForObject("campingCrew.getCrewThm", crewCode);
		
		return ctv;
	}

	@Override
	public int maxCrewCode(SqlMapClient smc) throws SQLException {
		int cnt = (Integer)smc.queryForObject("campingCrew.maxCrewCode");
		return cnt;
	}

	@Override
	public List<RecCrewVO2> checkCrewCtgr(SqlMapClient smc, RecCrewVO2 rv) throws SQLException {
		List<RecCrewVO2> crewList = smc.queryForList("campingCrew.checkCrewCtgr",rv);
		return crewList;
	}

	@Override
	public RecCrewVO2 crewInfo(SqlMapClient smc, String crewCode) throws SQLException {
		RecCrewVO2 crewList = (RecCrewVO2)smc.queryForObject("campingCrew.crewInfo",crewCode);
		return crewList;
	}

	@Override
	public int insertCrewMember(SqlMapClient smc, CrewVO cv) throws SQLException {
		int cnt = 0;

		Object obj = smc.insert("campingCrew.insertCrewMember",cv);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public int updateCrew(SqlMapClient smc, RecCrewVO rv) throws SQLException {
		int cnt = smc.update("campingCrew.updateCrew", rv);
		return cnt;
	}

	@Override
	public List<RecCrewVO2> crewInfoMemCode(SqlMapClient smc, RecCrewVO2 rv) throws SQLException {
		List<RecCrewVO2> crewList = smc.queryForList("campingCrew.crewInfoMemCode",rv);
		return crewList;
	}

	@Override
	public MemVO getUserIdByMemCode(SqlMapClient smc, String memCode) throws SQLException {
		MemVO mv = (MemVO)smc.queryForObject("campingCrew.getUserIdByMemCode", memCode);
		
		return mv;
	}

	@Override
	public int insertRply(SqlMapClient smc, CrewreplyVO crv) throws SQLException {
		int cnt = 0;

		Object obj = smc.insert("campingCrew.insertRply",crv);
		if(obj == null) {
			cnt = 1;
		}
		return cnt;
	}

	@Override
	public List<CrewreplyVO> crewRplyChk(SqlMapClient smc, String crewCode) throws SQLException {
		List<CrewreplyVO> crewList = smc.queryForList("campingCrew.crewRplyChk",crewCode);
		return crewList;
	}

	@Override
	public MemVO myInfoSel(SqlMapClient smc, String memCode) throws SQLException {
		MemVO crewList = (MemVO)smc.queryForObject("campingCrew.myInfoSel",memCode);
		return crewList;
	}

}
