package comm.service;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.fileupload.FileItem;

import com.ibatis.sqlmap.client.SqlMapClient;

import comm.dao.AtchFileDaoImpl;
import comm.dao.IAtchFileDao;
import filter.FileUploadRequestWrapper;
import util.SqlMapClientFactory;
import vo.AtFileVO;
import vo.CampHostVO;


public class AtchfileServiceImpl implements IatchFileService{
	
	private static IatchFileService fileService;
	private IAtchFileDao fileDao;
	private SqlMapClient smc;
	
	private AtchfileServiceImpl() {
		fileDao = AtchFileDaoImpl.getInstance();
		smc = SqlMapClientFactory.getInstance();
		
	}
	
	public static IatchFileService getInstance() {
		if(fileService == null) {
			fileService = new AtchfileServiceImpl();
		}
		return fileService;
	}
	

	@Override
	public AtFileVO saveAtchFileList(Map<String, Object> fileItemMap) throws Exception {
		
//		파일 기본정보 저장하기
		AtFileVO atchFileVO = new AtFileVO();
		
		fileDao.insertAtchFile(smc, atchFileVO);
		
		for(Object obj : fileItemMap.values()) {
			
			FileItem item = (FileItem) obj;
			
			File uploadDir = new File(FileUploadRequestWrapper.UPLOAD_DIRECTORY);
			
			if(!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			
//			전체 경로 중 파일명만 추출하기
			String orignFileName = new File(item.getName()).getName();
			long fileSize = item.getSize();
			String storeFileName = "";
			String filePath = "";
			File storeFile = null;
			
			do {
				storeFileName = UUID.randomUUID().toString().replace("-", "");
				filePath = FileUploadRequestWrapper.UPLOAD_DIRECTORY 
						+ File.separator + storeFileName;
				storeFile = new File(filePath);
				
			}while(storeFile.exists()); // 파일명이 중복되지 않을 때까지...
			
			//확장명 추출
			String fileExtension = orignFileName.lastIndexOf(".") < 0 ? 
					"" : orignFileName.substring(orignFileName.lastIndexOf(".") + 1);
			
			item.write(storeFile); // 업로드파일저장
			
//			atchFileVO.setStreFileNm(storeFileName);
//			atchFileVO.setFileSize(fileSize);
//			atchFileVO.setOrignlFileNm(orignFileName);
//			atchFileVO.setFileStreCours(filePath);
//			atchFileVO.setFileExtsn(fileExtension);
			atchFileVO.setFileSize(fileSize);
			atchFileVO.setFileOrigin(orignFileName);
			atchFileVO.setFilePath(filePath);
			atchFileVO.setFileExp(fileExtension);
			atchFileVO.setFileStrname(storeFileName);
			
//			파일 세부정보 저장
			fileDao.insertAtchFileDetail(smc, atchFileVO);
			//atchFileVO 파라미터로 던짐
			//insertAtchFileDetail(selectkey)과정 거치면서 atchFileVO에 fileId삽입됨
			
			item.delete(); // 임시 업로드 파일 삭제하기
			
		}
		
		return atchFileVO;
		
	}

	@Override
	public List<AtFileVO> getAtchFileList(AtFileVO atchFileVO) throws Exception {
		return fileDao.getAtchFileList(smc, atchFileVO);
	}

	@Override
	public AtFileVO getAtchFileDetail(AtFileVO atchFileVO) throws Exception {
		return fileDao.getAtchfileDetail(smc, atchFileVO);
	}

	@Override
	public int insertCmpImg(CampHostVO camphost) throws Exception {
		 
		return fileDao.insertCmpImg(smc, camphost);
	}

}
