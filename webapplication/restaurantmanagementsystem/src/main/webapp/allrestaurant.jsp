<%@ page import="java.util.List, zuci.rms.model.Restaurant" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% List<Restaurant> list1=(List<Restaurant>)request.getAttribute("rest"); %>
		<%= list1.get(0) %>
		<%= list1.get(1) %>
	
</body>
</html>