/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2021-06-24 10:27:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.ConstVO;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\"\r\n");
      out.write("\t\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\t<meta name=\"description\" content=\"\">\r\n");
      out.write("\t<meta name=\"author\" content=\"\">\r\n");
      out.write("\t\r\n");
      out.write("\t<title>로그인</title>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Custom fonts for this template-->\r\n");
      out.write("\t<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Custom styles for this template-->\r\n");
      out.write("\t<link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\tmain {\r\n");
      out.write("\t\t\theight: 897px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<main>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("\t<div class=\"container px-1\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\">\r\n");
      out.write("\t\t<img src=\"images/logo.png\" alt=\"logo\" width=\"100px\"></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("\t\t\taria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"pricing.html\">이벤트</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"notice.jsp\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">문의사항</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"blog-home.html\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"blog-post.html\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/clientjoin.do\">일반회원 회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"/hostjoin.do\">호스트 회원가입</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Outer Row -->\r\n");
      out.write("\t\t<div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"col-xl-10 col-lg-12 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-0\">\r\n");
      out.write("\t\t\t\t\t\t<!-- Nested Row within Card Body -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"p-5\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h1 class=\"h4 text-gray-900 mb-4\">Welcome Back!</h1>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<form class=\"user\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control form-control-user\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"exampleInputEmail\" aria-describedby=\"emailHelp\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Enter Id\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control form-control-user\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tid=\"exampleInputPassword\" placeholder=\"Password\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"custom-control custom-checkbox small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"custom-control-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tid=\"customCheck\"> <label\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"custom-control-label\" for=\"customCheck\">Remember\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tMe</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"login()\" -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-user btn-block\"> Login </a> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:login(1)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-user btn-block\"> User Login </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:login(2)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-user btn-block\"> Host Login </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:login(3)\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tclass=\"btn btn-primary btn-user btn-block\"> Admin Login </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"small\" href=\"forgot-password.html\">Forgot\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tPassword?</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"small\" href=\"register.html\">Create an Account!</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- Footer-->\r\n");
      out.write("\t<footer class=\"py-5 bg-dark\">\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<p class=\"m-0 text-center text-white\">Copyright &copy; Your\r\n");
      out.write("\t\t\tWebsite 2021</p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- Bootstrap core JS-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t<!-- Core theme JS-->\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JavaScript-->\r\n");
      out.write("\t<script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Core plugin JavaScript-->\r\n");
      out.write("\t<script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Custom scripts for all pages-->\r\n");
      out.write("\t<script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction login(flag){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#exampleInputEmail\").val().trim() == \"\") {\r\n");
      out.write("\t\t\talert(\"ID를 입력하세요.\");\r\n");
      out.write("\t\t\t$(\"#exampleInputEmail\").focus();\r\n");
      out.write("\t\t\tcnt++;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif($(\"#exampleInputPassword\").val().trim() == \"\") {\r\n");
      out.write("\t\t\talert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("\t\t\t$(\"#exampleInputPassword\").focus();\r\n");
      out.write("\t\t\tcnt++;\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("// \t\t사용자 로그인\r\n");
      out.write("\t\tif(flag == 1) {\r\n");
      out.write("\t\t\tvar param = {\r\n");
      out.write("\t\t\t\t\tuserID : $(\"#exampleInputEmail\").val().trim()\r\n");
      out.write("\t\t\t\t\t, userPW : $(\"#exampleInputPassword\").val().trim()\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"/login.do\"\r\n");
      out.write("\t\t\t\t,type: \"post\"\r\n");
      out.write("\t\t\t\t,data: param\r\n");
      out.write("\t\t\t\t,dataType: \"json\"\r\n");
      out.write("\t\t\t\t,success: function(data){\r\n");
      out.write("\t\t\t\t\tif(data.isSuccess == 1) { //로그인 성공+\r\n");
      out.write("\t\t\t\t\t\talert(\"로그인되셨습니다.\");\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"http://localhost\" + \"");
      out.print(ConstVO.VIEW_MAIN_PAGE);
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}else{ //로그인 실패-비밀번호오류 등..\r\n");
      out.write("\t// \t\t\t\t\talert(data.msg);\r\n");
      out.write("\t\t\t\t\t\talert(\"존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t,error: function(xhr){\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr);\r\n");
      out.write("\t\t\t\t\talert(\"오류발생. 관리자 문의 바랍니다.\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("// \t\t업체로그인\t\r\n");
      out.write("\t\t}else if (flag == 2) {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar param = {\r\n");
      out.write("\t\t\t\t\thostID : $(\"#exampleInputEmail\").val().trim()\r\n");
      out.write("\t\t\t\t\t, hostPW : $(\"#exampleInputPassword\").val().trim()\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"/hostlogin.do\"\r\n");
      out.write("\t\t\t\t,type: \"post\"\r\n");
      out.write("\t\t\t\t,data: param\r\n");
      out.write("\t\t\t\t,dataType: \"json\"\r\n");
      out.write("\t\t\t\t,success: function(data){\r\n");
      out.write("\t\t\t\t\tif(data.isSuccess == 1) { //로그인 성공+\r\n");
      out.write("\t\t\t\t\t\talert(\"로그인되셨습니다.\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"http://localhost\" + \"");
      out.print(ConstVO.VIEW_MAIN_PAGE);
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}else{ //로그인 실패-비밀번호오류 등..\r\n");
      out.write("\t// \t\t\t\t\talert(data.msg);\r\n");
      out.write("\t\t\t\t\t\talert(\"존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t,error: function(xhr){\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr);\r\n");
      out.write("\t\t\t\t\talert(\"오류발생. 관리자 문의 바랍니다.\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("// \t\t관리자로그인\t\r\n");
      out.write("\t\t}else if (flag == 3) {\r\n");
      out.write("\t\t\tvar param = {\r\n");
      out.write("\t\t\t\t\tadminID : $(\"#exampleInputEmail\").val().trim()\r\n");
      out.write("\t\t\t\t\t, adminPW : $(\"#exampleInputPassword\").val().trim()\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"/adminlogin.do\"\r\n");
      out.write("\t\t\t\t,type: \"post\"\r\n");
      out.write("\t\t\t\t,data: param\r\n");
      out.write("\t\t\t\t,dataType: \"json\"\r\n");
      out.write("\t\t\t\t,success: function(data){\r\n");
      out.write("\t\t\t\t\tif(data.isSuccess == 1) { //로그인 성공+\r\n");
      out.write("\t\t\t\t\t\talert(\"로그인되셨습니다.\");\r\n");
      out.write("\t\t\t\t\t\twindow.location.href = \"http://localhost\" + \"");
      out.print(ConstVO.VIEW_MAIN_PAGE);
      out.write("\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t}else{ //로그인 실패-비밀번호오류 등..\r\n");
      out.write("\t// \t\t\t\t\talert(data.msg);\r\n");
      out.write("\t\t\t\t\t\talert(\"존재하지 않는 아이디 이거나 비밀번호가 틀렸습니다.\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t,error: function(xhr){\r\n");
      out.write("\t\t\t\t\tconsole.log(xhr);\r\n");
      out.write("\t\t\t\t\talert(\"오류발생. 관리자 문의 바랍니다.\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
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
