<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="post">

		<fieldset>

			<table>

				<tr>
                <td><label>Enter ID</label></td>
                <td><input type="number"  name="id" placeholder="Enter Your ID" value="<%=request.getParameter("id")%>" readonly="readonly"></td>
            </tr>
				<tr>
					<td><label for="ln">Enter Name</label></td>
					<td><input type="text" name="name" placeholder="Enter Your Name" value="<%=request.getParameter("name")%>"></td>
				</tr>
				<tr>
					<td><label for="ln">Enter Email</label></td>
					<td><input type="email" name="email" placeholder="Enter Your email" value="<%=request.getParameter("email")%>" ></td>
				</tr>
				<tr>
					<td><label for="ln">Enter Password</label></td>
					<td><input type="password" name="password" placeholder="Enter Your password" value="<%=request.getParameter("pwd")%>" ></td>
				</tr>
				<tr>
					<td><label >Enter dob</label></td>
					<td><input type="date"  name="dob" placeholder="Enter Your DOB" value="<%=request.getParameter("date") %>"  ></td>
				</tr>
				<tr>
					<td><label >Male</label></td>
					<td><input type="radio"  name="gender" value="male" value="<%=request.getParameter("gender") %>" ></td>
				</tr>
				<tr>
					<td><label >Female</label></td>
					<td><input type="radio"  name="gender" value="female" value="<%=request.getParameter("gender")%>"></td>
				</tr>
				
				

				<tr>
					<td><button type="submit">Submit</button></td>

					<td><button type="reset">Reset</button></td>
				</tr>
			</table>

		</fieldset>
	</form>

</body>
</html>