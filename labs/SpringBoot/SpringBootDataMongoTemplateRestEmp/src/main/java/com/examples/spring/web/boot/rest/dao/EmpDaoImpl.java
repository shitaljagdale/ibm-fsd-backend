package com.examples.spring.web.boot.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.examples.spring.web.boot.rest.model.Employee;
@Component
public class EmpDaoImpl implements EmployeeDao {

	@Autowired
	MongoTemplate template;
	@Override
	public void save(Employee emp) {
		// TODO Auto-generated method stub
		template.insert(emp);
		
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return template.findAll(Employee.class);
		
	}

	@Override
	public Employee FindById(Integer id) {
		// TODO Auto-generated method stub
		return template.findById(id, Employee.class);
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		template.remove(emp);
		
		
	}

	@Override
	public void update(Employee emp) {
		// TODO Auto-generated method stub
		template.updateFirst(new Query(Criteria.where("id").is(emp.getId())), new Update().setOnInsert("department", "admin"), Employee.class);
		
		
	}

}
