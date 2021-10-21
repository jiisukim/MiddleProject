package join;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import comm.service.AtchfileServiceImpl;
import comm.service.IatchFileService;
import filter.FileUploadRequestWrapper;
import join.dao.HostjoinDaoImpl;
import join.dao.IHostjoinDao;
import join.service.HostjoinServiceImpl;
import join.service.IHostjoinService;
import vo.AtFileVO;
import vo.CampHostVO;
import vo.ConstVO;

@WebServlet("/CheckCamphostServlet")
public class HostJoinHandler  implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(HostJoinHandler.class);
	IHostjoinService hostjoinService = HostjoinServiceImpl.getInstance();
	private IatchFileService fileService = AtchfileServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {		
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";
		if(req.getMethod().equalsIgnoreCase("GET")) {
			url = ConstVO.VIEW_HOST_JOINFORM;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			String flag = req.getParameter("flag");
			
			if("checkId".equalsIgnoreCase(flag)) { //아이디중복체크
				checkCampId(req);
				url = ConstVO.VIEW_HOST_OVERLAPCHECK;
			}else if("checkNick".equalsIgnoreCase(flag)) { //닉네임중복체크
				checkCampNick(req);
				url = ConstVO.VIEW_HOST_OVERLAPCHECK;
			}else if("joinhost".equalsIgnoreCase(flag)) { //호스트 회원가입
				joinCamphost(req);
				url = ConstVO.VIEW_HOST_INSERTCHECK;
				
			}
			
			
		}
				
		// view 화면으로 이동 
		return url; 
		
	}

	private void joinCamphost(HttpServletRequest req) {
		
		
		
		
		CampHostVO camphost = new CampHostVO();
		String msg= "";
		
		String cmpId = req.getParameter("cmpId");
		String cmpPw = req.getParameter("cmpPw");		
		cmpPw = sha256(cmpPw);
		System.out.println("비밀번호 변환결과 : " + cmpPw);
		String cmpNick = req.getParameter("cmpNick");
		String cmpHostname = req.getParameter("cmpHostname");
		String cmpTel = req.getParameter("cmpTel");
		String cmpDesc = req.getParameter("cmpDesc");
		System.out.println(cmpDesc);
		String[] strArr = req.getParameterValues("cmpConv");
		String cmpConv = "";
		for( String conv : strArr) {
			System.out.println(conv);
			cmpConv += conv + " ";
		}
		cmpConv.trim();
		String cmpFee = req.getParameter("cmpFee");
		int cmpSitenum =  Integer.parseInt(req.getParameter("cmpSitenum"));
		String cmpLoadaddr = req.getParameter("cmpLoadaddr");
		String cmpAddr = req.getParameter("cmpAddr");
		String cmpLati = req.getParameter("cmpLati");
		String cmpLong = req.getParameter("cmpLong");
		String tmCode = req.getParameter("tmCode");
		String actCode = req.getParameter("actCode");
		
		
		
		camphost.setCmpId(cmpId);
		camphost.setCmpPw(cmpPw);
		camphost.setCmpNick(cmpNick);
		camphost.setCmpHostname(cmpHostname);
		camphost.setCmpTel(cmpTel);
		camphost.setCmpDesc(cmpDesc);
		camphost.setCmpConv(cmpConv);
		camphost.setCmpFee(cmpFee);
		camphost.setCmpSitenum(cmpSitenum);
		camphost.setCmpLoadaddr(cmpLoadaddr);
		camphost.setCmpAddr(cmpAddr);
		camphost.setCmpLati(cmpLati);
		camphost.setCmpLong(cmpLong);	
		camphost.setActCode(actCode);
		camphost.setTmCode(tmCode);
		
		//호스트정보 삽입
		int cnt = hostjoinService.insertCamphost(camphost); //camphost에 cmpCode세팅됨
		//캠프 테마랑 캠프 활동코드 삽입
		int cntAct = hostjoinService.insertCampact(camphost);
		int cntThm = hostjoinService.insertCampthm(camphost);
		
		
		//파일첨부작업
		AtFileVO atfileVo = new AtFileVO();
		if(FileUploadRequestWrapper.hasWrapper(req)) {//래퍼객체인지 확인
			
			Map<String, Object> fileItemMap = ((FileUploadRequestWrapper)req).getFileItemMap();
			LOGGER.info("파일 사이즈  : " + fileItemMap.size());
			
			if(fileItemMap.size() > 0 ) { //첨부파일 존재시
				//파일 세부첨부작업
				try {
					atfileVo = fileService.saveAtchFileList(fileItemMap); //서버에 파일삽입					
					//  fileId가 들어있는 atchFileVO객체 내뱉음
					
					camphost.setFileId(atfileVo.getFileId());
					int cntImg = fileService.insertCmpImg(camphost); //캠핑장호스트이미지 배정
					
					if(cntImg == 1) {
						LOGGER.info("캠프이미지테이블 작업 성공");
					}else {
						LOGGER.info("캠프이미지테이블 작업 실패");
					}					
					
				} catch (Exception e) {					
					e.printStackTrace();
				}				
			}else {
				LOGGER.info("첨부한 파일이 존재하지않습니다.");
			}
			
		}		
		
		System.out.println(cnt + cntAct + cntThm);
		if(cnt + cntAct + cntThm == 3) { //성공
			msg = "성공";
		}else {
			msg = "실패";
		}
		
		req.setAttribute("msg", msg);
		
		
	}

	private String sha256(String cmpPw) {
		StringBuilder builder = new StringBuilder();
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			
			digest.reset();
			byte[] hash = digest.digest(cmpPw.getBytes("UTF-8"));
			
			for( byte b : hash) {
				builder.append(String.format("%02x", b));
			}
			cmpPw = builder.toString();			
			
		} catch (NoSuchAlgorithmException e) {				
			e.printStackTrace();
		}catch(UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}		
		return cmpPw;
	}

	private void checkCampNick(HttpServletRequest req) {
		String overLap = "";
		String cmpNick = req.getParameter("cmpNick");		
		
		if(hostjoinService.checkCampNick(cmpNick)) {//닉네임 존재시
			overLap = "Y";
		}else { // 닉네임 존재 안할시
			overLap = "N";
		}
		
		req.setAttribute("overLap", overLap);		
	
		
	}

	private void checkCampId(HttpServletRequest req) {
		String overLap = "";
		String cmpId = req.getParameter("cmpId");		
		
		if(hostjoinService.checkCampId(cmpId)) {//아이디 존재시
			overLap = "Y";
		}else { // 아이디 존재 안할시
			overLap = "N";
		}
		
		req.setAttribute("overLap", overLap);		
	
		
	}

	
	
}
