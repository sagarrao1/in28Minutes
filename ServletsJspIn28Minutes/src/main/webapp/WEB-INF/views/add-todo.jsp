
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigator.jspf"%>

<div class="container">
	Your New Action Item:
	<form action="/add-todo.do" method="post">
		<fieldset class="form-group">
			<label> Description:</label> <input type="text" name="todoName"
				class="form-control" />
		</fieldset>
		<fieldset class="form-group">
			<label>Category : </label> <input type="text" name="category"
				class="form-control">
		</fieldset>

		<input type="submit" name="add" value="add" class="btn btn-success">

	</form>

</div>

<%@ include file="../common/footer.jspf"%>