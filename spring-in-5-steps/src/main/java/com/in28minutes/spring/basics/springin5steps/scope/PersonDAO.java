package com.in28minutes.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {

	@Autowired
	JdbcConnnection jdbcConnection;

	public JdbcConnnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JdbcConnnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
