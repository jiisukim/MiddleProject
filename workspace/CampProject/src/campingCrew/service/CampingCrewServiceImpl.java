package campingCrew.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import campingCrew.dao.CampingCrewDaoImpl;
import campingCrew.dao.ICampingCrewDao;
import util.SqlMapClientFactory;
import vo.CrewActVO;
import vo.CrewThmVO;
import vo.CrewVO;
import vo.CrewreplyVO;
import vo.MemVO;
import vo.RecCrewVO;
import vo.RecCrewVO2;

public class CampingCrewServiceImpl implements ICampingCrewService{

   private ICampingCrewDao camCrewDao;
   
   private static ICampingCrewService campCrewService;
   
   private SqlMapClient smc;
   
   private CampingCrewServiceImpl () {
      camCrewDao = CampingCrewDaoImpl.getInstance();
      smc = SqlMapClientFactory.getInstance();
   }
   public static ICampingCrewService getInstance() {
      if(campCrewService == null) {
         campCrewService = new CampingCrewServiceImpl();
      }
      
      return campCrewService;
   }
   
   
   @Override
   public int insertCrewMake(RecCrewVO rv) {
      int cnt = 0;
      
      try {
         cnt = camCrewDao.insertCrewMake(smc, rv);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return cnt;
   }

   @Override
   public int insertCrewMakeAct(CrewActVO cav) {
      int cnt = 0;
      
      try {
         cnt = camCrewDao.insertCrewMakeAct(smc, cav);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return cnt;
   }

   @Override
   public int insertCrewMakeThm(CrewThmVO ctm) {
      int cnt = 0;
      
      try {
         cnt = camCrewDao.insertCrewMakeThm(smc, ctm);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return cnt;
   }
   
   @Override
   public RecCrewVO getCrew(String crewCode) {
      RecCrewVO rv = null;
      try {
         rv = camCrewDao.getCrew(smc, crewCode);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return rv;
   }
   @Override
   public CrewActVO getCrewAct(String crewCode) {
      CrewActVO cav = null;
      try {
         cav = camCrewDao.getCrewAct(smc, crewCode);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return cav;
   }
   @Override
   public CrewThmVO getCrewThm(String crewCode) {
      CrewThmVO ctv = null;
      try {
         ctv = camCrewDao.getCrewThm(smc, crewCode);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return ctv;
   }
   @Override
   public int maxCrewCode() {
      int cnt = 0;
      
      try {
         cnt = camCrewDao.maxCrewCode(smc);
      }catch(SQLException ex) {
         ex.printStackTrace();
      }
            
      return cnt;
   }
   @Override
   public List<RecCrewVO2> checkCrewCtgr(RecCrewVO2 rv) throws SQLException {
      List<RecCrewVO2> crewList = new ArrayList<RecCrewVO2>();
      try {
         crewList = camCrewDao.checkCrewCtgr(smc, rv);
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return crewList;
   }
@Override
public RecCrewVO2 crewInfo(String crewCode) throws SQLException {
	RecCrewVO2 crewList = null;
    try {
       crewList = camCrewDao.crewInfo(smc, crewCode);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return crewList;
}
@Override
public int insertCrewMember(CrewVO cv) {
	int cnt = 0;
    
    try {
       cnt = camCrewDao.insertCrewMember(smc, cv);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return cnt;
}
@Override
public int updateCrew(RecCrewVO rv) {
	int cnt = 0;
	
	try {
		cnt = camCrewDao.updateCrew(smc, rv);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	return cnt;
}
@Override
public List<RecCrewVO2> crewInfoMemCode(RecCrewVO2 rv) {
	 List<RecCrewVO2> crewList = new ArrayList<RecCrewVO2>();
     try {
        crewList = camCrewDao.crewInfoMemCode(smc, rv);
     } catch (SQLException e) {
        e.printStackTrace();
     }
     return crewList;
}
@Override
public MemVO getUserIdByMemCode(String memCode) {
	MemVO mv = null;
    try {
    	mv = camCrewDao.getUserIdByMemCode(smc, memCode);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return mv;
}
@Override
public int insertRply(CrewreplyVO crv) {
	int cnt = 0;
    
    try {
       cnt = camCrewDao.insertRply(smc, crv);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return cnt;
}
@Override
public List<CrewreplyVO> crewRplyChk(String crewCode) {
	List<CrewreplyVO> crewList = new ArrayList<CrewreplyVO>();
    try {
       crewList = camCrewDao.crewRplyChk(smc, crewCode);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return crewList;
}
@Override
public MemVO myInfoSel(String memCode) {
	MemVO crewList = null;
    try {
       crewList = camCrewDao.myInfoSel(smc, memCode);
    } catch (SQLException e) {
       e.printStackTrace();
    }
    return crewList;
}

}