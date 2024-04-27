<%@page import="java.util.List"%>
<%@page import="dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% List<Employee> emps=(List<Employee>)request.getAttribute("objects"); %>

<table border="" >
<tr>
<th>id</th>
<th>name</th>
<th>email</th>
<th>pwd</th>
<th>gender</th>
<th>date</th>
<th>remove</th>
<th>update</th>
</tr>
<%for(Employee uv:emps){ %>
<tr>
<td><%=uv.getId() %></td>
<td><%=uv.getName() %></td>
<td><%=uv.getEmail() %></td>
<td><%=uv.getPassword() %></td>
<td><%=uv.getGender() %></td>
<td><%=uv.getDob() %></td>
<td><a href="def?primarykey=<%=uv.getId()%>">remove</a></td>
<td><a href="update.jsp?id=<%=uv.getId()%>&&name=<%=uv.getName()%>&&email=<%=uv.getEmail()%>&&pwd=<%=uv.getPassword()%>&&gender=<%=uv.getGender()%>&&date=<%=uv.getDob()%>">edit</a></td>

</tr>

<%} %>



</table>
</body>
</html>