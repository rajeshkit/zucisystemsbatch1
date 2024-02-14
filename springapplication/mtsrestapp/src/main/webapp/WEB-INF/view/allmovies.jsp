<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	mgafkjabfakj
  
    <h1>Movies are Details</h1>
    
    <table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">MOVIEID</th>
      <th scope="col">MOVIE NAME</th>
      <th scope="col">TICKET COST</th>
      <th scope="col">RELEASE DATE</th>
    </tr>
  </thead>
  <tbody>
     <c:forEach var="movie" items="${requestScope.list}">
    <tr>
      <th scope="row">1</th>
      <td>${movie.getMovieId()}</td>
      <td>${movie.getMovieName()}</td>
      <td>${movie.getTicketCost()}</td>
      <td>${movie.getReleaseDate()}</td>
      
    </tr>
    </c:forEach>
   
  </tbody>
</table>

<c:if test="${empty requestScope.list}">
	<p>Restaurant details not found</p>
</c:if>
</body>
</html>