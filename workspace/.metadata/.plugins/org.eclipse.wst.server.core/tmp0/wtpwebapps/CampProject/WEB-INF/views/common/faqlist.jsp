
<%@page import="vo.PagingVO"%>
<%@page import="vo.FaqVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<FaqVO> faqlist = (List<FaqVO>)request.getAttribute("faqlist");
	PagingVO pagevo = (PagingVO)request.getAttribute("pagevo");
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>이짝워뗘 | FAQ게시판</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">  	
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>	
    <script>
        function search(){            
            var searchOp = $(":selected").val();     //title contents nickname

            var param = { search : $("#searchFaq").val() , flag : searchOp};
            console.log(param);

            $.ajax({
                url : "/faqlist.do"
                ,type : "post"
                ,data : param
                ,dataType : "html"
                ,success : function(data){
                    $("tbody" ,"#faqTb").empty();
                    $("tbody" ,"#faqTb").html(data);
                }
                ,error : function(xhr){
                    console.log(xhr);
                    alert("오류입니다. 관리자에게 문의하세요")
                }
            });

        }

    </script>
    <style>
        .container{
            width: 1000px;
        }
    </style>
</head>
<body>
    <div class="container">
        <table class="table table-hover" id="faqTb">
            <colgroup>
                <col style="width: 45px;">
                <col style="width: auto;">
                <col style="width: 100px;">
                <col style="width: 100px;">            
            </colgroup>
            <thead>
                <th>#</th>
                <th>Subject</th>
                <th>Nickname</th>
                <th>Date</th>            
            </thead>
            <tbody>
                <%
                    int faqSize = faqlist.size();
                    if(faqSize>0){
                        for(int i = 0; i < faqSize; i++){ 
                %>
                    <tr>
                        <td><%=faqlist.get(i).getFaqCode() %></td>
                        <td><%=faqlist.get(i).getFaqTitle() %></td>
                        <td><%=faqlist.get(i).getAdmCode() %></td>
                        <td><%=faqlist.get(i).getFaqDate() %></td>
                    </tr>			
                            
                <%
                        }                
                %>               
                    <!-- 페이징 처리  -->
                    <tr>
                        <td colspan="4" align="center"> 
                            <ul class="pagination pagination-lg">
                                <%if(pagevo.getFirstPageNo() > pagevo.getPageSize()){ %>
                                    <li><a href="faqlist.do?pageNo=<%=pagevo.getFirstPageNo() - pagevo.getPageSize() %>">Previous</a></li>
                            
                                <%} %>
                                <%for(int pNo = pagevo.getFirstPageNo(); pNo <= pagevo.getLastPageNo(); pNo++){ %>
                                    <li><a <%if(pNo == pagevo.getCurrentPageNo()){%>class="active" <%} %>href="list.do?pageNo=<%=pNo %>"><%=pNo %></a></li>
                                    
                                <%} %>
                                <%if(pagevo.getLastPageNo() < pagevo.getTotalPageCount()){ %>
                                    <li><a href="list.do?pageNo=<%=pagevo.getFirstPageNo() +pagevo.getPageSize() %>">Next</a></li>
                                <%} %>
                            </ul>	            
                            <!--  <ul class="pagination pagination-lg">
                                    <li><a href="#">Previous</a></li>               
                                    <li><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li class="active"><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li><a href="#">6</a></li>
                                    <li><a href="#">7</a></li>
                                    <li><a href="#">8</a></li>
                                    <li><a href="#">9</a></li>
                                    <li><a href="#">Next</a></li>
                                </ul> -->
                            <!-- 페이징 처리  -->
                        </td>
                    </tr>
                    <%
                    }else{
                    %>
                        <tr align="center" class="warning">
                            <td colspan="4" >공지사항이 올라오지 않았습니다.</td>
                        </tr>
                    
                    <%} %>  
            </tbody>
        </table>
        <nav class="navbar">
            <div class="container-fluid">
                <form class="navbar-form navbar-right">
                    <select class="form-control col-sm-2" id="search" name="search">
                        <option value="title" selected>게시물 제목</option>
                        <option value="contents">게시물 내용</option>
                        <option value="nickname">작성자</option>
                    </select>
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="검색하기" name="search" onclick="search()" id="searchFaq">                     
                    </div>
                    <button class="btn btn-default" type="button" id="searchFaq">
                        검색&nbsp;<i class="glyphicon glyphicon-search" ></i>
                    </button>
                </form>
            </div>
        </nav>
    </div>




</body>
</html>