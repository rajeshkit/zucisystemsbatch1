<%@ page import="java.util.Date" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<h1>welcome</h1>
		<%! int a=1457;%>
		<% String name="Rajesh"; %>
		<%= a %>	<br><br>
		<% out.print(a); %>
	<!-- JSP EL - Expression language  -->
		dfdf:${name};
		<h2>End</h2>
		<c:if test="${25>5678}">
			<p>Welcome Rajesh</p>
		</c:if>
</body>
</html>