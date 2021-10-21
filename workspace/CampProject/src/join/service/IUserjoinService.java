package join.service;

import vo.MemVO;

public interface IUserjoinService {

	/**
	 * 주어진 회원 아이디를 이용하여 존재여부 체크
	 * @param memId 확인할 회원 아이디
	 * @return 아이디존재시 true, 없으면 false
	 */
	public boolean checkMemId(String memId);
	
	/**
	 * 주어진 회원닉네임을 이용하여 존재여부 체크
	 * @param memNick 확인할 회원 닉네임
	 * @return 닉네임 존재시 true, 없으면 false
	 */
	public boolean checkMemNick(String memNick);
	
	/**
	 * 주어진 회원정보를 MemVO객체에 담아 db에 insert하는 메서드
	 * @param member db에 insert할 자료가 저장된 MemVO객체
	 * @return 등록작업이 성공하면 1, 실패하면 0
	 */
	public int insertMember(MemVO member);
	
}
