package event.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import event.dao.EventDaoImpl;
import event.dao.IEventDao;
import util.SqlMapClientFactory;
import vo.EventVO;
import vo.PagingVO;

public class EventServiceImpl implements IEventService {
	
	private IEventDao eventDao;
	 
	private static IEventService eventService;
	
	private SqlMapClient smc;
	
	private EventServiceImpl() {
		eventDao = EventDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
	}
	
	public static IEventService getInstance() {
		
		if(eventService == null) {
			eventService = new EventServiceImpl();
		}
		
		return eventService;
	}

	@Override
	public int insertEvent(EventVO ev) {

	int cnt = 0;
		
		try {
			cnt = eventDao.insertEvent(smc, ev);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public List<EventVO> getEventAll(PagingVO pagingVO) {
		
		List<EventVO> eventList = new ArrayList<EventVO>();
		
		try {
			eventList = eventDao.getEventAll(smc, pagingVO);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return eventList;
	}

	@Override
	public int updateEvent(EventVO ev) {
	
		int cnt = 0;
		
		try {
			cnt = eventDao.updateEvent(smc, ev);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}

	@Override
	public int deleteEvent(String evnCode) {
	
		int cnt = 0;
		
		try {
			cnt = eventDao.deleteEvent(smc, evnCode);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}

	@Override
	public int getTotalCnt() {
		int cnt = 0;
		
		try {
			cnt = eventDao.getTotalCnt(smc);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
				
		return cnt;
	}
	

	@Override
	public EventVO getEvent(String evnCode) {
		EventVO ev = null;
		try {
			ev = eventDao.getEvent(smc, evnCode);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ev;
	}

}
