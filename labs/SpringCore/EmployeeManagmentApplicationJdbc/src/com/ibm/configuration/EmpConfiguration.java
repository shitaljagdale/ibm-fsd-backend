package com.ibm.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ibm.dao.EmployeeDaoImpl;
import com.ibm.dao.EmployeeDaoInterface;
import com.ibm.jdbc.JdbcConnection;
import com.ibm.model.Employee;
import com.ibm.service.EmployeeServiceImpl;


@ComponentScan("com.ibm")
@Configuration
public class EmpConfiguration {
	
	@Bean
	public EmployeeServiceImpl empservice(EmployeeDaoInterface dao) {
		return new EmployeeServiceImpl(dao);
		
	}
	@Bean
	public EmployeeDaoImpl empdao(JdbcConnection jdbcConnection) {
		return new EmployeeDaoImpl(jdbcConnection);
		
	}
	@Bean
	public JdbcConnection jdbcConnection() {
		return new JdbcConnection();
		
	}
	@Bean
	public Employee employee() {
		return new Employee(1,"leena",34,"Manager","CO",50000.0);
		
	}
	

}
