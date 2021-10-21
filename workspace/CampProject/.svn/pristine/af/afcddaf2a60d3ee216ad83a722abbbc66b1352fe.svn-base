package login.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import login.service.IUserLoginService;
import login.service.UserLoginServiceImpl;
import vo.MemVO;

@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	public UserLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				
		String memID = request.getParameter("userID");
		String memPW = request.getParameter("userPW");
		System.out.println("1");
		System.out.println(memID);
		System.out.println(memPW);
		
		System.out.println("2");
		IUserLoginService serv = UserLoginServiceImpl.getInstance();
		System.out.println("3");
		
		MemVO vo = serv.checkUser(memID, memPW);
		System.out.println(vo.getMemId());
		System.out.println(vo.getMemPw());
		
		System.out.println("4");
		
		HttpSession session = request.getSession(false);
		System.out.println("5");
		
		
		if( vo != null) {

			if (vo.getMemId().equals(memID)&&vo.getMemPw().equals(memPW)) {
					// 로그인 작업 -> 세션값 생성
					session.setAttribute("vo", vo);
//					session.setAttribute("pw", memPW);
			}	
		}
	}
}
