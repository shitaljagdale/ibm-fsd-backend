package com.examples.spring.web.boot.rest.dao;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


import com.examples.spring.web.boot.rest.model.Employee;


public interface EmployeeDao {

public void save(Employee emp);
public List<Employee> findAll();
public Employee FindById(Integer id);
public void delete(Employee emp);
public void update(Employee emp);
			
	
}
