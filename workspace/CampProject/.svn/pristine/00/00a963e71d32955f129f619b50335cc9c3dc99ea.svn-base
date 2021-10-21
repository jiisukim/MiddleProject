package join;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import comm.handler.CommandHandler;
import join.service.IUserjoinService;
import join.service.UserjoinServiceImpl;
import vo.ConstVO;
import vo.MemVO;

public class UserJoinHandler implements CommandHandler{

	private static final Logger LOGGER = Logger.getLogger(UserJoinHandler.class);
	IUserjoinService userjoinService = UserjoinServiceImpl.getInstance();
	
	@Override
	public boolean isRedirect(HttpServletRequest req) {
		return false;
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String url = "";
		if(req.getMethod().equalsIgnoreCase("GET")) {
			url = ConstVO.VIEW_CLIENT_JOINFORM;
			
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			
			String flag = req.getParameter("flag");
			if("checkId".equalsIgnoreCase(flag)) {//아이디 중복체크
				checkClientId(req);
				url = ConstVO.VIEW_HOST_OVERLAPCHECK;
			}else if("checkNick".equalsIgnoreCase(flag)) {//닉네임 중복체크
				checkClientNick(req);
				url = ConstVO.VIEW_HOST_OVERLAPCHECK;
			}else if("joinclient".equalsIgnoreCase(flag)) {//일반 회원가입
				joinMember(req);
				url = ConstVO.VIEW_HOST_INSERTCHECK;
			}		
			
		}
		
		
		return url;
	}

	private void joinMember(HttpServletRequest req) {
		MemVO member = new MemVO();
		String msg = "";		
		
//		 memId memPw memNick  memName	memBir memGen memEmail memTel
		String memId = req.getParameter("memId");
		String memPw = req.getParameter("memPw");
		memPw = sha256(memPw);
		String memNick = req.getParameter("memNick");
		String memName = req.getParameter("memName");
		String memBir = req.getParameter("memBir"); //"2012-10-21"
		String memGen = req.getParameter("memGen");
		String memEmail = req.getParameter("memEmail");
		String memTel = req.getParameter("memTel"); //010-3444-1231
		memTel = memTel.replaceAll("-", "");
		long memPoint = 0;
		String memDelyn = "N";
		
		member.setMemId(memId);
		member.setMemPw(memPw);
		member.setMemNick(memNick);
		member.setMemName(memName);
		member.setMemBir(memBir);
		member.setMemGen(memGen);
		member.setMemEmail(memEmail);
		member.setMemTel(memTel);
		member.setMemPoint(memPoint);
		member.setMemDelyn(memDelyn);
		
		int cnt = userjoinService.insertMember(member);
		
		if(cnt == 1) { //성공
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
	
	private void checkClientNick(HttpServletRequest req) {
		String memNick = req.getParameter("memNick");
		String overLap = "";
		
		if(userjoinService.checkMemNick(memNick)) {//닉네임 존재시
			overLap = ConstVO.Y;
		}else { //닉네임 존재 안할시
			overLap = ConstVO.N;
		}
		
		req.setAttribute("overLap", overLap);
		
	}

	private void checkClientId(HttpServletRequest req) {
		String memId = req.getParameter("memId");
		String overLap = "";
		
		if(userjoinService.checkMemId(memId)) {//아이디존재시
			overLap = ConstVO.Y;
		}else { //존재안할시
			overLap = ConstVO.N;
		}
		
		req.setAttribute("overLap", overLap);
		
	}
	
	
	
}
