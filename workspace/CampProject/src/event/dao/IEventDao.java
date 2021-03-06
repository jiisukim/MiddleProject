package event.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.EventVO;
import vo.PagingVO;

public interface IEventDao{
      
      public int insertEvent(SqlMapClient smc, EventVO ev) throws SQLException;      //등록
      

      public int getTotalCnt(SqlMapClient smc) throws SQLException;   //페이징처리
      
      
      public List<EventVO> getEventAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException; //페이지

      
      public int updateEvent(SqlMapClient smc, EventVO ev) throws SQLException;   //업데이트
      

      public int deleteEvent(SqlMapClient smc, String evnCode) throws SQLException;   //삭제
      
      
      public EventVO getEvent(SqlMapClient smc, String evnCode) throws SQLException;   //주어진 코드로 정보 조회
   }

