package mamManage.service;

import java.util.List;

import vo.MemVO;
import vo.PagingVO;

public interface IMemManagerService {
	
	/**
	 * 전체 회원 목록을 조회하기 위한 메서드
	 * @return 전체 회원목록
	 */
	public List<MemVO> getAllMemberList(PagingVO pagingVO);
	
	/**
	 * 전체 회원수 조회
	 * @return 전체 회원수
	 */
	public int getTotalCnt();
	
	/**
	 * 회원정보를 검색하기 위한 메서드
	 * @param mv 검색할 데이터를 담은 VO객체
	 * @return 검색된 결과를 담은 List 객체
	 */
	public List<MemVO> getSearchMember(MemVO mv);
	
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 조회하는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당ID에 해당하는 회원정보
	 */
	public MemVO getMember(String memId);
}
