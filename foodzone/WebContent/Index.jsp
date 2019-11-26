<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FoodZone</title>
</head>


<body>

	<header><a href="Admin.jsp"><button>Admin</button></a>
	<a href="Cityemployee.jsp"><button>Cityemployee</button></a></header>
	<form action="/foodzone/CityServlet" method="post"> 
	
	<h1>FoodZone</h1>
	
	<input type="text" name="city" placeholder="searchcity">
	<a href="city.jsp"><button>Go</button></a>

	</form>
</body>
</html>