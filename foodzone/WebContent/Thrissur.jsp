<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>      <%--Importing all the dependent classes--%>
  <%@page import="com.face.dao.CityDAO"%>
  <%@page import="java.util.Iterator"%>
  <%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Thrissur</title>
</head>
	<body>
		
	<%--  <c:forEach var="list" items="${data}">
	${data}
	</c:forEach>  --%>
	
	<h1>Thrissur</h1>
	<h3>Available hotels</h3>
	
        <form action="/foodzone/HotelServlet" method="post"> 
         <%Iterator itr;%>
           <% List data= (List)request.getAttribute("data");
               for (itr=data.iterator(); itr.hasNext(); )
                  
               {
           %>
          
              <a href="hotel.jsp" ><td><%=itr.next()%></td></a>
             <%--   <a href="hotel.jsp" ><td> <td><%=itr.next()%></a> --%>
              
                     <%}%>

	  </form>
	
	</body>
</html>