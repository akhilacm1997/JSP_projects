<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="com.face.bo.RegisterBO" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		if(request.getAttribute("user")!=null)
		{
			RegisterBO reg=(RegisterBO) request.getAttribute("user");
		}
	%>

			<h1>Record</h1>
			<div>Name:<%=reg.getName() %></div>
			<div>Password<%=reg.getAddress() %></div>
			<div>Mobile<%=reg.getMobile() %></div>
<%
}else
			
		}
%>
</body>
</html> --%>