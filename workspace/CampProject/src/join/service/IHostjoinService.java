package join.service;

import vo.CampHostVO;

public interface IHostjoinService {

	
	
	/**
	 * 주어진 캠프호스트 아이디를 이용하여 존재여부 체크
	 * @param cmpId 확인할 캠프호스트 아이디
	 * @return	아이디 존재시 true, 존재하지 않으면 false
	 */
	public boolean checkCampId(String cmpId);
	
	/**
	 * 주어진 캠프호스트 닉네임을 이용하여 존재여부 체크
	 * @param cmpNick 확인할 캠프호스트 닉네임
	 * @return	닉네임 존재시 true, 존재하지 않으면 false
	 */
	public boolean checkCampNick(String cmpNick);
	
	/**
	 * 주어진 캠프호스트 정보를 CampHostVO객체에 담아 db에 insert하는 메서드
	 * @param camphost db에 insert할 자료가 저장된 CampHostVO객체
	 * @return 등록작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환됨.
	 */
	public int insertCamphost(CampHostVO camphost);
	
	/**
	 * 주어진 캠핑활동정보를 CampHostVO객체에 담아 db에 insert하는 메서드
	 * @param camphost db에 insert할 자료가 저장된 CampHostVO객체
	 * @return 등록작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환됨.
	 */
	public int insertCampact(CampHostVO camphost);
	
	/**
	 * 주어진 캠핑테마정보를 CampHostVO객체에 담아 db에 insert하는 메서드
	 * @param camphost db에 insert할 자료가 저장된 CampHostVO객체
	 * @return 등록작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환됨.
	 */
	public int insertCampthm(CampHostVO camphost);
}
