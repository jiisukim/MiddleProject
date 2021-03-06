package event.service;

import java.util.List;

import vo.EventVO;
import vo.PagingVO;

public interface IEventService {

	public int insertEvent(EventVO ev);
	
	
	public List<EventVO> getEventAll(PagingVO pagingVO);
	
	
	public int updateEvent(EventVO ev);
	

	public int deleteEvent(String evnCode);
	

	public int getTotalCnt();
	
	
	public EventVO getEvent(String evnCode);
	
}
