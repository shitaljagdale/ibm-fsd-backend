package com.examples.spring.web.boot.rest.dao;

import java.util.List;

import com.examples.spring.web.boot.rest.model.Employee;



public interface EmployeeDAO {
	
	public void addEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public List<Employee> listEmployees();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);
}
