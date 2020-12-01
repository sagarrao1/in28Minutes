<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigator.jspf"%>

<div class="container">
	<h1>First Servlet and JSP page......</h1>
	<form action="/login.do" method="post">
		<p>
			<font color="red">${errorMessage}</font>
		</p>
		Enter your name: <input type="text" name="name" /> Password :<input
			type="password" name="password"> <input type="submit"
			value="Login">
	</form>
</div>

<%@ include file="../common/footer.jspf"%>





