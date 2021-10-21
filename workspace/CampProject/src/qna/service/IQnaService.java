package qna.service;

import java.util.List;

import vo.PagingVO;
import vo.QnaVO;

public interface IQnaService {
	/**
	 * QnaVO에 담겨진 자료를 DB에 사용자가 insert하는 메서드
	 * @param qnaVO			DB에 insert할 자료가 저장된 VO객체
	 * @return				성공시 1, 실패시 0
	 */
	public int insertQna(QnaVO qnaVO);
	
	/**
	 * 전체 Qna 목록을 조회하기 위한 메서드
	 * @param pagingVO		QnaVO 전체 리스트를 담은 pagingVO객체
	 * @return				QnaVO객체를 담고 있는 List객체
	 */
	public List<QnaVO> getQnaAll(PagingVO pagingVO);
	
	/**
	 * 사용자가 자신이 올린 Qna를 수정하기 위해 사용하는 메서드
	 * @param qnaVO			수정할 Qna정보
	 * @return				성공시 1, 실패시 0
	 */
	public int updateQna(QnaVO qnaVO);
	
	/**
	 * Qna 번호를 매개변수로 받아서 해당 Qna를 삭제하는 메서드
	 * @param qnaCode		삭제할 Qna번호
	 * @return				성공시 1, 실패시 0
	 */
	public int deleteQna(String qnaCode);
	
	/**
	 * 전체 Qna 갯수 조회
	 * @return				전체 Qna갯수
	 */
	public int getTotalCnt();
	
	/**
	 * 주어진 QnaCode에 해당하는 Qna를 조회하는 메서드
	 * @param qnaCode		검색할 Qna의 코드
	 * @return				해당 코드의 QnaVO객체
	 */
	public QnaVO getQna(String qnaCode);
	
	/**
	 * 
	 * @param qnaVO
	 * @return
	 */
	public String getMemNick(QnaVO qnaVO);
	

}
