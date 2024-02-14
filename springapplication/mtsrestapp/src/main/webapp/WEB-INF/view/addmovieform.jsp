<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<style type="text/css">
		.error{
			color: red;
			font-size: 1em;
		}
		
	</style>
    <title>Hello, world!</title>
  </head>
  <body>
   <form:form action="addmovie" modelAttribute="movie1">
   <div class="container-fluid">
  <div class="form-group">
    <form:input type="number" path="movieId" class="form-control" name="movieId" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Movie ID"></form:input>
  	<form:errors path="movieId" cssClass="error"></form:errors>
  </div>
  <div class="form-group">
    <form:input type="text" path="movieName"  name="movieName" class="form-control" id="exampleInputPassword1" placeholder="Enter Movie Name"></form:input>
  		<form:errors path="movieName" cssClass="error"></form:errors>
  </div>
  <div class="form-group">
    <form:input type="number" path="ticketCost" name="ticketCost" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Ticket Cost"></form:input>
  </div>
  <div class="form-group">
    <form:input type="date" path="releaseDate"  name="releaseDate" class="form-control"  id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Release Date"></form:input>
    <form:errors path="releaseDate" cssClass="error"></form:errors>
  </div>
 
  <button type="submit" class="btn btn-primary">Submit</button>
</div>
</form:form>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>