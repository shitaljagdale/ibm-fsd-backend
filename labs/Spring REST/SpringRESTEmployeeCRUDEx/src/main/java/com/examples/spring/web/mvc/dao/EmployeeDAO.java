package com.examples.spring.web.mvc.dao;
import com.examples.spring.web.rest.model.Employee;

import java.util.List;



public interface EmployeeDAO {
	
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List<Employee> listEmployees();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);
}
