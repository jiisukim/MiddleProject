package comm.service;

import java.util.List;
import java.util.Map;

import vo.AtFileVO;
import vo.CampHostVO;


public interface IatchFileService {
	
	/**
	 * 첨부파일 목록을 저장하기 위한 메서드
	 * @param fileItemMap
	 * @return
	 * @throws Exception
	 */
	public AtFileVO saveAtchFileList(Map<String, Object> fileItemMap) throws Exception;
	
	/**
	 * 첨부파일 목록 조회하기
	 * @param atchFileVO
	 * @return
	 * @throws Exception
	 */
	public List<AtFileVO> getAtchFileList(AtFileVO atchFileVO) throws Exception;
	
	/**
	 * 첨부파일에 대한 상세조회. 디테일 정보를 얻는다.
	 * @param atchFileVO
	 * @return
	 * @throws Exception
	 */
	public AtFileVO getAtchFileDetail(AtFileVO atchFileVO) throws Exception;
	
	/**
	 * 캠프이미지테이블에 해당켐프코드에 대한 이미지코드를 삽입하는 메서드
	 * @param camphost
	 * @return 성공하면 1, 실패하면 0
	 * @throws Exception
	 */
	public int insertCmpImg(CampHostVO camphost)throws Exception;
	

}
