package notice.service;

import java.util.List;

import vo.NoticeVO;
import vo.PagingVO;

public interface IHostNoticeService {
	/**
	 * NoticeVO에 담겨진 자료를 DB에 insert하는 메서드
	 * @param nv DB에 insert할 자료가 저장된 객체
	 * @return 등록작업 완료시 1 , 실패시 0
	 */
	public int insertNotice(NoticeVO nv);
	
	
	/**
	 *  전체 공지 목록을 조회하기 위한 메서드
	 * @return 전체 회원목록
	 */
	public List<NoticeVO> getNoticeAll(PagingVO pagingVO);
	
	
	/**
	 * 공지사항을 수정하기 위한 메서드
	 * @param nv 수정할 공지정보
	 * @return 작업성공 :1 , 작업실패 : 0
	 */
	public int updateNotice(NoticeVO nv);
	
	/**
	 * 공지번호 매개변수로 받아서 그 공지 삭제하는 메서드
	 * @param ntcCode 삭제할 공지번호
	 * @return 작업성공: 1 , 작업실패 : 0
	 */
	public int deleteNotice(String ntcCode);
	
	/**
	 * 전체 회원수 조회
	 * @return 전체 회원수
	 */
	public int getTotalCnt();
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 조회하는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당ID에 해당하는 회원정보
	 */
	public NoticeVO getNotice(String ntcCode);
	
	/**
	 * 주어진 회원ID에 해당하는 회원정보를 조회하는 메서드
	 * @param memId 검색할 회원ID
	 * @return 해당ID에 해당하는 회원정보
	 */
	public List<NoticeVO> searchNotice(String ntcTitle);
}
