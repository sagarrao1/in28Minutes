<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is Logn JSP Title</title>
</head>
<body>
	<%-- My First JSP page..... ${name} and password is ${password} --%>
	
	<p> <font color="red"> ${ErrorMsg} </font>  </p>
	<form action="/spring-mvc/login" method="post">
		Enter your name:  <input type="text" name="name" > 
		Enter your password:  <input type="password" name="password">
		<input type="submit" value="Submit">
	</form>
</body>
</html>



<!-- Valid user welcome page   name = sagar password =dummy
Invalid user login page  -->