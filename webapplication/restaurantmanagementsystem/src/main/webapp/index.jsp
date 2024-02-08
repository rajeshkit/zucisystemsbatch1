<%@ page import="zuci.rms.model.Restaurant" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<html>
<body>
<h2>Hello World!</h2>
<a href="ShowRestaurantServlet">Show all Restaurant</a>
${sessionScope.name}
<a href="LogoutServlet">Logout</a>

</body>
</html>
