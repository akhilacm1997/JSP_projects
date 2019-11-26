<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hotel details entering page</title>
</head>
		<body>
		<form action="/foodzone/HotelServlet" method="post"> 
	
		<h1>Hotels details entry</h1>
	<table>
	<tr>
	<td>Hotel name:</td>
	<td><input type="text" name="hotelname"></td>
	</tr>
	<tr>
	<td>Hotel ID:</td>
	<td>
	<input type="text" name="hotelid"></td>
	</tr>
	<tr>
	<td>Hotel Location:</td><td><input type="text" name="hotellocation"></td></tr>
	<tr>
	<td>Working Time:</td>
	<td><input type="text" name="workingtime" ></td></tr>
	<tr><td>Foods:</td><td><input type="text" name="foods" ></td>
	<tr><td>Veg/Non:</td><td><input type="text" name="veg/non" ></td></tr>
	<tr><td>Feedback:</td><td><input type="text" name="feedbacks"></td></tr>
		<tr>
		<td><input type="submit" value="submit"></td></tr>
		</table>
		</form>
		
		</body>
</html>