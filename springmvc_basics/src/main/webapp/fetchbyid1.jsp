<%@page import="springmvc_basics.dto.MvcDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% MvcDto list= (MvcDto) request.getAttribute("object"); %>

<table border="2px solid">

<tr>
<th>ID</th>
<th>Name</th>
</tr>



<tr>

<td><%=list.getId() %></td>

<td><%=list.getName() %></td>


</tr>










</table>


</body>
</html>