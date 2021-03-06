package faq.service;

import java.util.List;


import vo.FaqVO;
import vo.PagingVO;

public interface IFaqService {
	
	/**
	 * FaqVO에 담겨진 자료를 db에 insert하는 메서드
	 * @param faq db에 insert할 자료가 저장된 FaqVO객체
	 * @return 등록작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환됨. 
	 */
	public int insertFaq(FaqVO faq);
	
	/**
	 * 주어진 PagingVO객체안의 페이징설정대로 faq게시글 목록을 조회하는 메서드
	 * @param pagevo 페이징설정이 담겨있는 pagevo객체
	 * @return	페이징설정을 토대로 조회된 전체 faq게시글 목록
	 */
	public List<FaqVO> getFaqWithPaging(PagingVO pagevo);
	
	/**
	 * faq게시글을 수정하기 위한 메서드
	 * @param faq 수정할 faq게시글 정보
	 * @return 수정작업이 성공하면 1이상의 값이 반환되고 실패하면 0이 반환됨.
	 */
	public int updateFaq(FaqVO faq);
	
	/**
	 * faq게시글코드를 매개변수로 받아서 해당 게시글을 삭제하는 메서드
	 * @param faqCode 삭제할 faq게시글코드
	 * @return 작업성공 1 작업실패 0
	 */
	public int deleteFaq(String faqCode);
	
	/**
	 * faq게시글을 검색하기 위한 메서드
	 * @param faq 검색할 데이터를 담은 FaqVO객체
	 * @return 검색된 결과를 담은 List객체
	 */
	public List<FaqVO> getFaqDetail(FaqVO faq);
	
	/**
	 * 검색된 faq게시글의 수를 알아내기 위한 메서드
	 * @param faq 검색할 데이터를 담은 FaqVO객체
	 * @return 검색된 faq게시글들의 전체수
	 */
	public int getFaqDetailTotalCnt(FaqVO faq);	
	
	/**
	 * 주어진 faqCode에 해당하는 faq게시글을 조회하는 메서드
	 * @param faqCode
	 * @return	faqCode에 해당하는 faq게시글정보
	 */
	public FaqVO getFaq(String faqCode);
	
	/**
	 * 전체 faq게시글 수를 조회하는 메서드
	 * @return 전체 faq게시글 수 
	 */
	public int getTotalCnt();
	
	/**
	 * 주어진 admCode에 해당하는 admNick을 찾는 메서드
	 * @param admCode 검색할때 쓰일 관리자코드
	 * @return 검색해서 나온 admNick
	 */
	public String getAdminNick(String admCode);
	
	/**
	 * 모든 faq게시글을 조회하는 메서드
	 * @return	전체 faq게시글
	 */
	public List<FaqVO> getAllFaq();
	
}
