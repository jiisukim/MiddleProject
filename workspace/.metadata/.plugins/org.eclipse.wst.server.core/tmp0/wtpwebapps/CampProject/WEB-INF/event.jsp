<%@page import="vo.PagingVO"%>
<%@page import="java.util.List"%>
<%@page import="vo.EventVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<EventVO> eventList = (List<EventVO>)request.getAttribute("eventList");
	
	
	PagingVO pagingVO = (PagingVO)request.getAttribute("pagingVO");

%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>이벤트</title>
        
<style type="text/css">
	td {
		width: 200px;	
	}
	table{
		border: 1px white solid;
	}

</style>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body class="d-flex flex-column">
        <main class="flex-shrink-0">
            <!-- Navigation-->
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container px-5">
              	   <a class="navbar-brand" href="index.jsp">
                   <img src="images/logo.png" alt="logo" width="100px"></a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                          <li class="nav-item"><a class="nav-link" href="pricing.html">ì´ë²¤í¸</a></li>
							<li class="nav-item"><a class="nav-link" href="/host/hostNotice.do">ê³µì§ì¬í­</a></li>
							<li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" id="navbarDropdownBlog" href="#"
								role="button" data-bs-toggle="dropdown" aria-expanded="false">ë¬¸ìì¬í­</a>
								<ul class="dropdown-menu dropdown-menu-end"
									aria-labelledby="navbarDropdownBlog">
									<li><a class="dropdown-item" href="blog-home.html">Q&A</a></li>
									<li><a class="dropdown-item" href="/faq.do">FAQ</a></li>
								</ul>
							</li>
                            <li class="nav-item dropdown"><a
								class="nav-link dropdown-toggle" id="navbarDropdownPortfolio"
								href="#" role="button" data-bs-toggle="dropdown"
								aria-expanded="false"><i class="fas fa-user-circle"></i></a>
								<ul class="dropdown-menu dropdown-menu-end"
									aria-labelledby="navbarDropdownPortfolio">
									<li><a class="dropdown-item" href="/clientjoin.do">일반회원 회원가입</a></li>
									<li><a class="dropdown-item" href="/hostjoin.do">호스트 회원가입</a></li>
								</ul>
							</li>
                        </ul>
                    </div>
                </div>
            </nav>
            
            
            <h1> 게시판 </h1>
	<table border="1">
		<tr>
			<td>등록일</td>
			<td>제목</td>
			<td>이벤트 시작날</td>
			<td>이벤트 종료날</td>
		</tr>

		<%
			int eventSize = eventList.size();
			if (eventSize > 0) { // 사이즈가 0보다 클때 : 공지사항 게시물이 있을 때
				for (int i = 0; i < eventSize; i++) {
					String date = eventList.get(i).getEvnDate();
					date = date.substring(0, 10);
		%>
		<tr>
			<td><%= date %></td>
			<td><a href="view.do?evnCode=<%= eventList.get(i).getEvnCode() %>"><%= eventList.get(i).getEvnTitle() %></a></td>
			<td><%= eventList.get(i).getEvnStart() %></td>
			<td><%= eventList.get(i).getEvnEnd() %></td>
		</tr>
		<%		
		 } // for문
	%>

		<!-- 페이징 처리 시작 -->
		<tr>
			<td colspan="4" align="center">
				<%if(pagingVO.getFirstPageNo() > pagingVO.getPageSize()) { %> <a
				href="list.do?pageNo=<%=pagingVO.getFirstPageNo() - pagingVO.getPageSize() %>">[이전]</a>
				<%} %> <%for(int pNo = pagingVO.getFirstPageNo(); pNo <= pagingVO.getLastPageNo(); pNo++){ %>
				<a <%if(pNo == pagingVO.getCurrentPageNo()){ %>
				style="color: green;" <%} %> href="list.do?pageNo=<%=pNo %>">[<%=pNo %>]
			</a> <%} %> <%if(pagingVO.getLastPageNo() < pagingVO.getTotalPageCount()) { %>
				<a
				href="list.do?pageNo=<%=pagingVO.getFirstPageNo() + pagingVO.getPageSize() %>">[다음]</a>
				<%} %>
			</td>
		</tr>
		<!-- 페이징 처리 끝 -->
		<% 		
		}else{ // 회원정보가 존재하지 않으면...
	%>
		<tr>
			<td colspan="4">게시글 정보가 없습니다.</td>
		</tr>
		<%
		}
	%>
		<tr align="center">
			<td colspan="4"><a href="insert.do">[게시글 등록]</a></td>
		</tr>

	</table>
            
            
            
              
        </main>
        <!-- Footer-->
        <footer class="bg-dark py-4 mt-auto">
            <div class="container px-5">
                <div class="row align-items-center justify-content-between flex-column flex-sm-row">
                    <div class="col-auto"><div class="small m-0 text-white">Middle Project 2021.06.25</div></div>
                    <div class="col-auto">
                        <a class="link-light small" href="#!">Privacy</a>
                        <span class="text-white mx-1">&middot;</span>
                        <a class="link-light small" href="#!">Terms</a>
                        <span class="text-white mx-1">&middot;</span>
                        <a class="link-light small" href="#!">Contact</a>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
