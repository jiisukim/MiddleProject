/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2021-06-25 05:43:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.crew;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.AdminVO;
import vo.CampHostVO;
import vo.MemVO;
import vo.ConstVO;
import vo.CrewThmVO;
import vo.CrewActVO;
import vo.RecCrewVO;

public final class crewView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	RecCrewVO rv = (RecCrewVO)request.getAttribute("rv");
	CrewActVO cav = (CrewActVO)request.getAttribute("cav");
	CrewThmVO ctv= (CrewThmVO)request.getAttribute("ctv");

      out.write("     \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");

String startDate = rv.getRecrStart();
	   startDate = startDate.substring(0,10);
String endDate = rv.getRecrStart();
	   endDate = endDate.substring(0,10);

      out.write("\r\n");
      out.write("\r\n");

HttpSession loginSession = request.getSession();
String loginType = (String) loginSession.getAttribute(ConstVO.LOGIN_TYPE);
MemVO memVO = (MemVO) loginSession.getAttribute("memVO");
CampHostVO hostVO = (CampHostVO) loginSession.getAttribute("hostVO");
AdminVO adminVO = (AdminVO) loginSession.getAttribute("adminVO");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"\" />\r\n");
      out.write("\t<meta name=\"author\" content=\"\" />\r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"../../../vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"../../../css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t<link href=\"../../../css/sb-admin-2.min.css\" rel=\"stylesheet\">\t\t\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">  \t\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.15.3/css/all.css\" integrity=\"sha384-SZXxX4whJ79/gErwcOYf+zWLeJdY/qpuqC4cAa9rOGUstPomtqpuNWT9wdPEn2fk\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>  \r\n");
      out.write("\t<script src=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("\t\r\n");
      out.write("\t<link href=\"http://fonts.googleapis.com/earlyaccess/nanumpenscript.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t@import url(//fonts.googleapis.com/earlyaccess/jejumyeongjo.css);\r\n");
      out.write("\t#crewView{\r\n");
      out.write("\t\tfont-family: 'Nanum Pen Script', cursive;\r\n");
      out.write("\t\tfont-size: large;\r\n");
      out.write("\t\tfont-size: xx-large;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\twidth: 1000px;\r\n");
      out.write("\t\tborder: 2px solid black; \r\n");
      out.write("\t\tcolor: white;\r\n");
      out.write("\t\tbackground-color: gray;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: 300px;\r\n");
      out.write("\t\tleft: 500px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<title>?????????</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- Navigation--> \r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t<div class=\"container px-1\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"../../../index.jsp\">\r\n");
      out.write("\t\t<img src=\"../../../images/logo.png\" alt=\"logo\" width=\"100px\"></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t");

			// ????????? ???????????? ??????
			if(ConstVO.LOGIN_TYPE_USER.equals(loginType) ) {
			
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/host/hostNotice.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">????????????</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/qna/list.do\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/faq.do\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

						if(memVO == null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/clientjoin.do\">???????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/hostjoin.do\">????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"logout.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"memMyPage.jsp\">???????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");
	
			// ?????? ???????????? ??????
			}else if(ConstVO.LOGIN_TYPE_HOST.equals(loginType)){
			
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/host/hostNotice.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">????????????</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/qna/list.do\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/faq.do\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

						if(hostVO == null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/clientjoin.do\">???????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/hostjoin.do\">????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"logout.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"hostMyPage.jsp\">???????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");

			// ????????? ???????????? ??????	
			}else if(ConstVO.LOGIN_TYPE_ADMIN.equals(loginType)){
			
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/host/hostNotice.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">????????????</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/qna/list.do\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/faq.do\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

						if(adminVO == null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/clientjoin.do\">???????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/hostjoin.do\">????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"logout.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"portfolio-item.html\">???????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t");
	
			// ????????? ????????? ?????? ??? ??????		
			}else {
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/event/list.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"/host/hostNotice.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">????????????</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/qna/list.do\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/faq.do\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t");

						if(memVO == null || hostVO == null) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.do\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/clientjoin.do\">???????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/hostjoin.do\">????????? ????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						} else {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"logout.do\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"portfolio-item.html\">???????????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t");

						}
						
      out.write("\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\t\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav> \r\n");
      out.write("\t<br><br><br><br><br><br><br><br><br><br>\r\n");
      out.write("\t<div id=\"crewView\">\r\n");
      out.write("\t\t<p>?????? : ");
      out.print(rv.getRecrTitle() );
      out.write("</p>\r\n");
      out.write("\t\t<p>?????? : ");
      out.print(startDate );
      out.write(' ');
      out.write('~');
      out.write(' ');
      out.print(endDate );
      out.write("</p>\r\n");
      out.write("\t\t<p>?????? : ");
      out.print(rv.getRecrCurrnum() );
      out.write('/');
      out.print(rv.getRecrNeednum() );
      out.write("</p>\r\n");
      out.write("\t\t<p>?????? : ");
      out.print(ctv.getTmCode() );
      out.write(" / ?????? : ");
      out.print(cav.getActCode() );
      out.write("</p>\r\n");
      out.write("\t\t<p>?????? : ");
      out.print(rv.getRecrContent() );
      out.write(" </p>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
