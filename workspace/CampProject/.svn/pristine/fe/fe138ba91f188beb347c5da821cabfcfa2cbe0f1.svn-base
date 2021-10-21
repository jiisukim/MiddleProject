package adminCrud.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.MemVO;
import vo.PagingVO;

public interface IAdminDao {
	
//  public int insertEvent(SqlMapClient smc, EventVO ev) throws SQLException;      //등록
    

    public int getTotalCnt(SqlMapClient smc) throws SQLException;   //페이징처리
    
    
    public List<MemVO> getMemAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException; 

    
    public int updateMem(SqlMapClient smc, MemVO ev) throws SQLException;   //업데이트
    

    public int deleteMem(SqlMapClient smc, String memCode) throws SQLException;   //삭제
    
    
    public MemVO getMem(SqlMapClient smc, String memCode) throws SQLException;   //주어진 코드로 정보 조회

}
