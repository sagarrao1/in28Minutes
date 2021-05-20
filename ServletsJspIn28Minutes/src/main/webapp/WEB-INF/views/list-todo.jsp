
<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigator.jspf"%>

<div class="container">
	<h3>
		Welcome Mr./Miss ${name}.<br>
	</h3>
	<h5>
		Your Todo's are...... <br>
	</h5>


	<table class="table table-striped">
		<thead>
			<th>Description</th>
			<th>Category</th>
			<th>Actions</th>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.name}</td>
					<td>${todo.category}</td>
					<td><a class="btn btn-danger"
						href="/delete-todo.do?deleteTodo=${todo.name}&category=${todo.category}">Delete</a></td>

				</tr>
			</c:forEach>
		</tbody>

	</table>
	</br> <a class="btn btn-success" href="/add-todo.do">Add New Item</a>
</div>

<%@ include file="../common/footer.jspf"%>
