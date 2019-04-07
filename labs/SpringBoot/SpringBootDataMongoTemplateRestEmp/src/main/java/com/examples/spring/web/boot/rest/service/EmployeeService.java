package com.examples.spring.web.boot.rest.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examples.spring.web.boot.rest.dao.EmployeeDao;

import com.examples.spring.web.boot.rest.model.Employee;

@Service
public class EmployeeService {
	 @Autowired 
	 EmployeeDao repository;
	
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
		return repository.FindById(empId);
		
	}
	public void delete(Employee emp )
	{
		repository.delete(emp);
	}	
	
	public List<Employee> list() {
		List<Employee> employees = new ArrayList<>();
		for (Employee employee : repository.findAll()) {
			employees.add(employee);
		}
		return employees;
	}
	
//	public List<Employee> findByDepartment(String department){
//		 List<Employee> emp= repository.findByDepartment("IT");
//		 return  emp;
//	}
	
}
