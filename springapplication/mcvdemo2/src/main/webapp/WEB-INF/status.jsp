<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Bus Number: ${requestScope.bus.getBusNumber()}
		Travels Name: ${requestScope.bus.getTravelsName()}
		Ticket Cost: ${requestScope.bus.getCost()}
</body>
</html>