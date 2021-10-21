package comm.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import vo.AtFileVO;
import vo.CampHostVO;

public interface IAtchFileDao {
	/**
	 * 첨부파일 저장
	 * @param atchFileVO
	 * @return
	 * @throws SQLException
	 */
	public long insertAtchFile(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException;
	
	/**
	 * 첨부파일 세부정보 저장
	 * @param atchFileVO
	 * @return
	 * @throws SQLException
	 */
	public long insertAtchFileDetail(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException;
	
	/**
	 * 캠프이미지테이블에 해당정보 저장
	 * @param smc sqlmapclient 객체
	 * @param camphost 해당cmpCode가 담긴 CampHostVO객체
	 * @return
	 * @throws SQLException
	 */
	public int insertCmpImg(SqlMapClient smc, CampHostVO camphost)throws SQLException;
	
	/**
	 * 첨부파일 목록 조회
	 * @param atchFileVO
	 * @return
	 * @throws SQLException
	 */
	public List<AtFileVO> getAtchFileList(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException;
	
	/**
	 * 첨부파일 세부정보 조회 메서드
	 * @param atchFileVO
	 * @return
	 * @throws SQLException
	 */
	public AtFileVO getAtchfileDetail(SqlMapClient smc, AtFileVO atchFileVO) throws SQLException;

}
