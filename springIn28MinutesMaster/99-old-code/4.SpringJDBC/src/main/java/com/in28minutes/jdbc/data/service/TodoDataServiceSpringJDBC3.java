package com.in28minutes.jdbc.data.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.in28minutes.jdbc.hsql.HsqlDatabase;
import com.in28minutes.jdbc.model.Todo;

class TodoMapper1 implements RowMapper<Todo> {
	public Todo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Todo todo = new Todo();
		todo.setId(rs.getInt(1));
		todo.setDescription(rs.getString(2));
		todo.setDone(rs.getBoolean(3));
		return todo;
	}

}

public class TodoDataServiceSpringJDBC3 {

	private static final String INSERT_TODO_QUERY = "INSERT INTO TODO(DESCRIPTION,IS_DONE) VALUES(?, ?)";

	private static final String DELETE_TODO_QUERY = "DELETE FROM TODO WHERE ID=?";
	private static final String SELECT_ALL_TODOS = "SELECT * FROM TODO";

	HsqlDatabase db = new HsqlDatabase();

	JdbcTemplate jdbcTemplate = new JdbcTemplate(new SingleConnectionDataSource(db.conn, false));

	public static Logger logger = LogManager.getLogger(TodoDataServiceSpringJDBC3.class);

	public void insertTodos(List<Todo> todos) {
		for (Todo todo : todos) {
			insertTodo(todo);
		}
	}

	private void insertTodo(Todo todo) {
		System.out.println("todo.isDone : " + todo.isDone());
		jdbcTemplate.update(INSERT_TODO_QUERY, todo.getDescription(), todo.isDone());
	}

	public void deleteTodo(int id) {
		jdbcTemplate.update(DELETE_TODO_QUERY, id);
	}

	public List<Todo> retrieveAllTodos() throws SQLException {		
		//return jdbcTemplate.query(SELECT_ALL_TODOS, new BeanPropertyRowMapper<Todo>(Todo.class));		
		return jdbcTemplate.query(SELECT_ALL_TODOS, new TodoMapper1()	);
	}

	public static void main(String[] args) throws SQLException {

		TodoDataServiceSpringJDBC3 dataservice = new TodoDataServiceSpringJDBC3();

		dataservice.insertTodos(Arrays.asList(new Todo(0, "New Todo Test Sagar", true)));
		dataservice.deleteTodo(1);
		List<Todo> todos = dataservice.retrieveAllTodos();
		logger.info(todos);
		dataservice.db.closeConnection();
	}
}
