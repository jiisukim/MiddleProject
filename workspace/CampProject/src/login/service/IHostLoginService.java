package login.service;

import vo.CampHostVO;
import vo.MemVO;

public interface IHostLoginService {
	
	/**
	 * 주어진 업체 아이디를 이용하여 존재여부 체크
	 * @param userId	확인할 사용자 또는 관리자 아이디
	 * @return			아이디 존재시  CampHostVO, 없으면 null을 반환
	 */
	public CampHostVO checkHost(String hostId, String hostPw);
	
	/**
	 * 주어진 업체 비밀번호를 이용하여 존재여부 체크
	 * @param userPW	확인할 사용자 또는 관리자 비밀번호
	 * @return			비밀번호 존재시 true, 존재하지 않으면 false
	 */
	public boolean checkHostPW(String hostPw);
	
	/**
	 * 주어진 업체의 정보를 db에서 가져와 CampHostVO객체에 담는 메서드 
	 * @param memVO		db에서 가져온 자료가 저장된 CampHostVO객체
	 * @return			자료가 있으면 CampHostVO, 없으면 null을 반환
	 */
	public CampHostVO getHostVO(CampHostVO hostVO);
	
	
	

}
