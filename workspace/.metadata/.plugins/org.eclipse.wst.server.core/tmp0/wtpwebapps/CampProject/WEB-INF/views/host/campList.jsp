<%@page import="java.util.List"%>
<%@page import="vo.CampHostVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   List<CampHostVO> campingList = (List<CampHostVO>)request.getAttribute("campingList");
%>    
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>캠핑 정보 조회</title>
<style type="text/css">
   table {
      width: 100%;
      border-top: 3px solid #168;
      border-collapse: collapse;
   }
   
   th {
      color: #168;
      text-align: center;
   }
   
   th, td {
      padding: 10px;
      border: 1px solid #ddd;
   }
   
   caption {
      font-weight: bold;
      color: #168;
      padding: 10px;
   }
   
</style>
</head>
<body>
   <table>
      <caption>캠핑장 내 정보 조회</caption>
      
   <%
      int campSize = campingList.size();
      
      if(campSize > 0) { // 회원 정보가 존재하면
         for(int i=0; i<campSize; i++){
   %>
         <tr>
            <td rowspan ="4"><img src=" <%= campingList.get(i).getCmpHostname() %>"></td>
            <td>캠핑장 이름</td>
            <td><%= campingList.get(i).getCmpHostname() %></td>
         </tr>
         <tr>
            <td>ID</td>
            <td><%= campingList.get(i).getCmpId() %></td>
         </tr>
         <tr>
            <td>전화</td>
            <td><%= campingList.get(i).getCmpTel()%></td>
         </tr>
         <tr>
            <td>가격</td>
            <td><%= campingList.get(i).getCmpFee() %></td>
         </tr>
         <tr>
            <td>설명</td>
            <td><%= campingList.get(i).getCmpDesc() %></td>
         </tr>
         <tr>
            <td>편의시설</td>
            <td><%= campingList.get(i).getCmpConv() %></td>
         </tr>
            
         <tr>
            <td>수용인원</td>
            <td><%= campingList.get(i).getCmpSitenum() %></td>
         </tr>
         <tr>
            <td>주소</td>
            <td><%= campingList.get(i).getCmpAddr() %></td>
         </tr>
      
   <%
         }
      }
   %>
      

         
   </table>
</body>
</html>