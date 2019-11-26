<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
    <body>


		<h1>Welcome to Registration</h1>
		<form action="/application/RegisterServlet" method="post">
		<table>
		
		<tr>
		<td>User Name:</td>
		<td><input type="text" name="name"></td>
		</tr>
		<tr></tr>
		<tr>
		<td>Email:</td>
		<td><input type="text" name="email" ></td>
		</tr>
		<tr></tr>
		<tr>
		<td>Password:</td>
		<td><input type="password" name="password" ></td>
		</tr>
		<tr>
		<td>RepeatePassword:</td>
		<td><input type="password" name="repeatepassword"> </td>
		</tr>
		<tr>
		<td>Date of birth:</td>
		<td><input type="text" name="dateofbirth" ></td>
		</tr>
		<tr>
		<td>Mobile:</td>
		<td><input type="text" name="mobile" ></td>
		</tr>
		<tr></tr>
		
		<tr>
		<td></td>
		<td><input type="submit" value="register"></td>
		</tr>
		
		<%-- <td><% request.getParameter("name"); %> </td> --%>
		
		</table>
		</form>
		<a href="login.jsp">login</a>



   </body>
</html>