package event.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.EventVO;
import vo.PagingVO;

public class EventDaoImpl implements IEventDao  {
   private static IEventDao eventDao;
      
      private EventDaoImpl() {}
      
      public static IEventDao getInstance() {
         if(eventDao == null) {
            eventDao = new EventDaoImpl();
         }
         return eventDao;
      }
   

   @Override
   public int insertEvent(SqlMapClient smc, EventVO ev) throws SQLException {
      int cnt = 0;
      
      Object obj = smc.insert("event.insertEvent", ev);
      
      if(obj == null) {
         cnt = 1;
      }
      
      return cnt;
   }

   @Override
   public int getTotalCnt(SqlMapClient smc) throws SQLException {
      int cnt = (Integer)smc.queryForObject("event.getTotalCnt");
      return cnt;
   }

   @Override
   public List<EventVO> getEventAll(SqlMapClient smc, PagingVO pagingVO) throws SQLException {
      List<EventVO> eventList = smc.queryForList("event.getEventAll", pagingVO);
      
      
      return eventList;
   }

   @Override
   public int updateEvent(SqlMapClient smc, EventVO ev) throws SQLException {
      int cnt = smc.update("event.updateEvent", ev);
      
      return cnt;
   }

   @Override
   public int deleteEvent(SqlMapClient smc, String evnCode) throws SQLException {
      int cnt = smc.delete("event.deleteEvent", evnCode);
      
      return cnt;
   }

   @Override
   public EventVO getEvent(SqlMapClient smc, String evnCode) throws SQLException {
      EventVO ev = 
      (EventVO)smc.queryForObject("event.getEvent", evnCode);
      
      return ev;
   }

}