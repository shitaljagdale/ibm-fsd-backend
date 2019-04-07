package com.examples.spring.web.boot.rest.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.spring.web.boot.rest.data.EmployeeInterface;
import com.examples.spring.web.boot.rest.model.Employee;

@Service
public class EmployeeService {
	 @Autowired 
	 EmployeeInterface repository;
	
	

	public void add(Employee employee)
	{

		repository.save(employee);
		
		
	}
	
	public void update(Employee employee)
	{
		
		repository.save(employee);
	}
	
	public Employee get(Integer empId)
	{
		return repository.findById(empId).get();
		
	}
	public void delete(Integer empId)
	{
		repository.deleteById(empId);
	}	
	
	public List<Employee> list() {
		List<Employee> employees = new ArrayList<>();
		for (Employee employee : repository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}
	
	public List<Employee> findByDepartment(String department){
		 List<Employee> emp= repository.findByDepartment("IT");
		 return  emp;
	}
	
}
