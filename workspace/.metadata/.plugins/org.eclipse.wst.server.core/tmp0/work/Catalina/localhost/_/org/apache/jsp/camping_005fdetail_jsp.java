/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.73
 * Generated at: 2021-06-23 05:32:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import vo.CampHostVO;
import java.util.List;

public final class camping_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

	CampHostVO campingVo = (CampHostVO)request.getAttribute("campingVo");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- ??????????????? -->\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("<meta name=\"description\" content=\"\" />\r\n");
      out.write("<meta name=\"author\" content=\"\" />\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>????????????</title>\r\n");
      out.write("<!-- Favicon-->\r\n");
      out.write("<link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap icons-->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\"\r\n");
      out.write("\trel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template-->\r\n");
      out.write("<link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- Core theme CSS (includes Bootstrap)-->\r\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template-->\r\n");
      out.write("<link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\"\r\n");
      out.write("\ttype=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#headerImg {\r\n");
      out.write("\tbackground-size: 100% 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tem1, #tem2, #tem3, #tem4 {\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tpadding: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#tem1:hover, #tem2:hover, #tem3:hover, #tem4:hover {\r\n");
      out.write("\tbackground-color: #EAEAEA;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction fnMove(seq) {\r\n");
      out.write("\t\tvar location = document.querySelector(\"#tema\" + seq).offsetTop;\r\n");
      out.write("\t\twindow.scrollTo({\r\n");
      out.write("\t\t\ttop : location,\r\n");
      out.write("\t\t\tbehavior : 'smooth'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"d-flex flex-column h-100\">\r\n");
      out.write("\t<main class=\"flex-shrink-0\"> \r\n");
      out.write("\t<!-- Navigation--> \r\n");
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
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"pricing.html\">?????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"notice.jsp\">????????????</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownBlog\" href=\"#\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">????????????</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownBlog\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"blog-home.html\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"faq.jsp\">FAQ</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" id=\"navbarDropdownPortfolio\"\r\n");
      out.write("\t\t\t\t\thref=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"><i class=\"fas fa-user-circle\"></i></a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-menu-end\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"navbarDropdownPortfolio\">\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"login.jsp\">?????????</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"portfolio-item.html\">????????????</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<!-- ????????????  -->\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("\t\t\t\t\t<a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\"\r\n");
      out.write("\t\t\t\t\trole=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\taria-expanded=\"false\"> <i class=\"fas fa-envelope fa-fw\"></i> \r\n");
      out.write("\t\t\t\t\t<!-- Counter - Messages -->\r\n");
      out.write("\t\t\t\t\t\t<!-- <span class=\"badge badge-danger badge-counter\">+3</span> -->\r\n");
      out.write("\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- Dropdown - Alerts -->\r\n");
      out.write("\t\t\t\t\t<div\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("\t\t\t\t\t\taria-labelledby=\"alertsDropdown\">\r\n");
      out.write("\t\t\t\t\t\t<h6 class=\"dropdown-header\">Alerts Center</h6>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-circle bg-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"font-weight-bold\">A new monthly report is\r\n");
      out.write("\t\t\t\t\t\t\t\t\tready to download!</span>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-circle bg-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t$290.29 has been deposited into your account!\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mr-3\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"icon-circle bg-warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("\t\t\t\t\t\t\t\tSpending Alert: We've noticed unusually high spending for your\r\n");
      out.write("\t\t\t\t\t\t\t\taccount.\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a> <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show\r\n");
      out.write("\t\t\t\t\t\t\tAll Alerts</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</nav> \r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Page Content--> \r\n");
      out.write("\t<section class=\"py-5\">\r\n");
      out.write("\t<div class=\"container px-5\">\r\n");
      out.write("\t\t<h1 class=\"fw-bolder fs-5 mb-4\">Camping</h1>\r\n");
      out.write("\t\t<div class=\"card border-0 shadow rounded-3 overflow-hidden\">\r\n");
      out.write("\t\t\t<div class=\"card-body p-0\">\r\n");
      out.write("\t\t\t\t<div class=\"row gx-0\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-xl-7\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"bg-featured-blog\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('https://dummyimage.com/700x350/343a40/6c757d')\"></div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-6 col-xl-5 py-lg-5\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"p-4 p-md-5\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"badge bg-primary bg-gradient rounded-pill mb-2\">News</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"h2 fw-bolder\">");
      out.print(campingVo.getCmpNick() );
      out.write("</div>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<p><strong>Price </strong> ");
      out.print(campingVo.getCmpFee() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p><strong>Number </strong> ");
      out.print(campingVo.getCmpFee() );
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section> \r\n");
      out.write("\t<section class=\"py-5 bg-light\">\r\n");
      out.write("\t<div class=\"container px-5\">\r\n");
      out.write("\t\t<div class=\"row gx-5\">\r\n");
      out.write("\t\t\t<div class=\"col-xl-8\">\r\n");
      out.write("\t\t\t\t<h2 class=\"fw-bolder fs-5 mb-4\">News</h2>\r\n");
      out.write("\t\t\t\t<!-- News item-->\r\n");
      out.write("\t\t\t\t<div class=\"mb-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"small text-muted\">May 12, 2021</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"link-dark\" href=\"#!\"><h3>Start Bootstrap\r\n");
      out.write("\t\t\t\t\t\t\treleases Bootstrap 5 updates for templates and themes</h3></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- News item-->\r\n");
      out.write("\t\t\t\t<div class=\"mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"small text-muted\">May 5, 2021</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"link-dark\" href=\"#!\"><h3>Bootstrap 5 has\r\n");
      out.write("\t\t\t\t\t\t\tofficially landed</h3></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- News item-->\r\n");
      out.write("\t\t\t\t<div class=\"mb-5\">\r\n");
      out.write("\t\t\t\t\t<div class=\"small text-muted\">Apr 21, 2021</div>\r\n");
      out.write("\t\t\t\t\t<a class=\"link-dark\" href=\"#!\"><h3>This is another news\r\n");
      out.write("\t\t\t\t\t\t\tarticle headline, but this one is a little bit longer</h3></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"text-end mb-5 mb-xl-0\">\r\n");
      out.write("\t\t\t\t\t<a class=\"text-decoration-none\" href=\"#!\"> More news <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"bi bi-arrow-right\"></i>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section> \r\n");
      out.write("\t<!-- Blog preview section--> \r\n");
      out.write("\t<section class=\"py-5\">\r\n");
      out.write("\t<div class=\"container px-5\">\r\n");
      out.write("\t\t<h2 class=\"fw-bolder fs-5 mb-4\">Featured Stories</h2>\r\n");
      out.write("\t\t<div class=\"row gx-5\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100 shadow border-0\">\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/600x350/ced4da/6c757d\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-primary bg-gradient rounded-pill mb-2\">News</div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"text-decoration-none link-dark stretched-link\" href=\"#!\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"h5 card-title mb-3\">Blog post title</div></a>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text mb-0\">Some quick example text to build on\r\n");
      out.write("\t\t\t\t\t\t\tthe card title and make up the bulk of the card's content.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 bg-transparent border-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex align-items-end justify-content-between\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle me-3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/40x40/ced4da/6c757d\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"fw-bold\">Kelly Rowan</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-muted\">March 12, 2021 &middot; 6 min\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tread</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100 shadow border-0\">\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/600x350/adb5bd/495057\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-primary bg-gradient rounded-pill mb-2\">Media</div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"text-decoration-none link-dark stretched-link\" href=\"#!\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"h5 card-title mb-3\">Another blog post title</div></a>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text mb-0\">This text is a bit longer to\r\n");
      out.write("\t\t\t\t\t\t\tillustrate the adaptive height of each card. Some quick example\r\n");
      out.write("\t\t\t\t\t\t\ttext to build on the card title and make up the bulk of the\r\n");
      out.write("\t\t\t\t\t\t\tcard's content.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 bg-transparent border-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex align-items-end justify-content-between\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle me-3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/40x40/ced4da/6c757d\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"fw-bold\">Josiah Barclay</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-muted\">March 23, 2021 &middot; 4 min\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tread</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 mb-5\">\r\n");
      out.write("\t\t\t\t<div class=\"card h-100 shadow border-0\">\r\n");
      out.write("\t\t\t\t\t<img class=\"card-img-top\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"https://dummyimage.com/600x350/6c757d/343a40\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"badge bg-primary bg-gradient rounded-pill mb-2\">News</div>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"text-decoration-none link-dark stretched-link\" href=\"#!\"><div\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"h5 card-title mb-3\">The last blog post title is a\r\n");
      out.write("\t\t\t\t\t\t\t\tlittle bit longer than the others</div></a>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"card-text mb-0\">Some more quick example text to\r\n");
      out.write("\t\t\t\t\t\t\tbuild on the card title and make up the bulk of the card's\r\n");
      out.write("\t\t\t\t\t\t\tcontent.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card-footer p-4 pt-0 bg-transparent border-top-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"d-flex align-items-end justify-content-between\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"d-flex align-items-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"rounded-circle me-3\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://dummyimage.com/40x40/ced4da/6c757d\" alt=\"...\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"small\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"fw-bold\">Evelyn Martinez</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"text-muted\">April 2, 2021 &middot; 10 min\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tread</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"text-end mb-5 mb-xl-0\">\r\n");
      out.write("\t\t\t<a class=\"text-decoration-none\" href=\"#!\"> More stories <i\r\n");
      out.write("\t\t\t\tclass=\"bi bi-arrow-right\"></i>\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t</main>\r\n");
      out.write("\t<!-- Footer-->\r\n");
      out.write("\t<footer class=\"bg-dark py-4 mt-auto\">\r\n");
      out.write("\t<div class=\"container px-5\">\r\n");
      out.write("\t\t<div\r\n");
      out.write("\t\t\tclass=\"row align-items-center justify-content-between flex-column flex-sm-row\">\r\n");
      out.write("\t\t\t<div class=\"col-auto\">\r\n");
      out.write("\t\t\t\t<div class=\"small m-0 text-white\">Middle Project 2021.06.25</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-auto\">\r\n");
      out.write("\t\t\t\t<a class=\"link-light small\" href=\"#!\">Privacy</a> <span\r\n");
      out.write("\t\t\t\t\tclass=\"text-white mx-1\">&middot;</span> <a class=\"link-light small\"\r\n");
      out.write("\t\t\t\t\thref=\"#!\">Terms</a> <span class=\"text-white mx-1\">&middot;</span> <a\r\n");
      out.write("\t\t\t\t\tclass=\"link-light small\" href=\"#!\">Contact</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</footer>\r\n");
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
      out.write("\r\n");
      out.write("\t<!-- Bootstrap core JS-->\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\t<!-- Core theme JS-->\r\n");
      out.write("\t<script src=\"js/scripts.js\"></script>\r\n");
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
