<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="/webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<title>Todo.JSP !!!!!</title>
</head>
<body>
   
 <h1> welcome Mr./Miss ${name}.<br> Your Todo's are...... <br>
 
 <ol>
  <c:forEach items="${todos}" var="todo">
	 	<li>${todo.name} &nbsp;&nbsp;&nbsp; <a href="/delete-todo.do?deleteTodo=${todo.name}">Delete</a></li>
  </c:forEach> 
 </ol>  
 </h1>
 <br>
 <form action="/list-todo.do" method="post">
 	<input type="text" name="todoName"/>
 	<input type="submit" value="add">
 
 </form>
 
 <script src="webjars/jquery/1.9.1/jquery.min.css"></script>
 <script src="webjars/bootstrap/3.3.6/css/bootstrap.min.css"></script>
 
</body>
</html>