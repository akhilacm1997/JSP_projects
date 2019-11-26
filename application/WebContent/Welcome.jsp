<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%-- 
	 <%@page import="java.util.ArrayList"%>      Importing all the dependent classes
  <%@page import="com.face.dao.LoginDAO"%>
  <%@page import="java.util.Iterator"%>
  <%@page import="java.util.List"%> --%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
		<body>
		
		<h1> <i>Monaco</i></h1>
		
		
		<%-- <%
		Object n=request.getAttribute("n");
		%> --%>
	<%-- 	<h1> <%= request.getParameter("n") %> </h1> --%>
	<%--  <c:forEach var="list" items="${data}">
	${data}
	</c:forEach> 
	 --%>
<%-- 	 
<table class="table">
        <tr>
            <th>Name</th>
            <th>EmailID</th>
            <th>PhoneNO</th>
            <th>UserName</th>
        </tr>
         <%Iterator itr;%>
           <% List data= (List)request.getAttribute("data");
               for (itr=data.iterator(); itr.hasNext(); )
                  
               {
           %>
             <tr>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
               <td><%=itr.next()%></td>
           </tr>
          <%}%>
</table> --%>
	  <h1>welcome  :${data1}</h1>
	<h3>Email :${data}</h3>
	<h3>Mobile:${data2}</h3> 
		</body>
</html>