package campMangage.service;

import java.util.List;

import vo.CampHostVO;
import vo.PagingVO;

public interface ICampManagerService {
	
	
	public int updateCamping(CampHostVO cv);
	
	/**
	 * 전체 회원 목록을 조회하기 위한 메서드
	 * @return 전체 회원목록
	 */
	public List<CampHostVO> getAllCampingList(PagingVO pagingVO);
	
	/**
	 * 전체 회원수 조회
	 * @return 전체 회원수
	 */
	public int getTotalCnt();

	/**
	 * 주어진 회원아이드를 이용하여 회원존재여부 체크
	 * @param memId
	 * @return 회원존재시 true, 존재하지 않으면 false
	 */
	public boolean checkCamping(String memId);
	
	/**
	 * 회원정보를 검색하기 위한 메서드
	 * @param cv 검색할 데이터를 담은 VO객체
	 * @return 검색된 결과를 담은 List 객체
	 */
	public List<CampHostVO> getSearchCamping(CampHostVO cv);
	
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 조회하는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당ID에 해당하는 회원정보
	 */
	public CampHostVO getCamping(String memId);
}
