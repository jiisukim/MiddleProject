package comm.handler;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.service.AtchfileServiceImpl;
import comm.service.IatchFileService;
import vo.AtFileVO;

public class FileDownloadHandler implements CommandHandler{
	
	private IatchFileService fileService = AtchfileServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		long fileid = req.getParameter("fileId") != null ? Long.parseLong(req.getParameter("fileId")) : -1 ;
		int fileSn = req.getParameter("fileNo") != null ? Integer.parseInt(req.getParameter("fileNo")) : 1 ;
		
		// 파일 정보 조회
		AtFileVO atchFileVo = new AtFileVO();
		atchFileVo.setFileId(fileid);
		atchFileVo.setFileNo(fileSn);
		atchFileVo = fileService.getAtchFileDetail(atchFileVo);
		
		//파일 다운로드 처리를 위한 응답헤더 정보 설정하기
		resp.setContentType("application/octet-stream");		
		String fileName = URLEncoder.encode(atchFileVo.getFileOrigin(),"UTF-8");
		// +문자 공백으로 바꿔주기
		fileName.replaceAll("\\+", "%20");
		
		resp.setHeader("content-disposition", "attachment; filename=\"" + fileName + "\"");
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(atchFileVo.getFilePath()));
		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());
	
		int c = 0;
		while( (c=bis.read()) != -1 ) {
			bos.write(c);
		}
		bis.close();
		bos.close();
		
		
		
		return null;
	}
	
	
}
