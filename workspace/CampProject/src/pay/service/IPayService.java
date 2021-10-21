package pay.service;

import vo.CampBookVO;
import vo.CampHostVO;

public interface IPayService {

	/**
	 * 주어진 CmpCode로 해당 캠핑업체를 상세조회하는 메서드
	 * @param CmpCode 확인할 캠핑업체 코드
	 * @return 조회해서 나온 CampHostVO객체
	 */
	public CampHostVO searchCampHost(String CmpCode);
	
	/**
	 * 주어진 예약정보를 CampBookVO객체에 담아 db에 insert하는 메서드
	 * @param campbook 입력할 CampBookVO객체
	 * @return 성공시 1 , 실패시 0
	 */
	public int insertCampbook(CampBookVO campbook);
}
