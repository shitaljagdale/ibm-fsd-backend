package com.examples.spring.web.boot.rest.data;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.examples.spring.web.boot.rest.model.Employee;


public interface EmployeeRepository extends MongoRepository<Employee, Integer>{

	
	//public List<Employee> findByDepartment(String department);
	
//	@Query("select e from Employee e where e.department=?1")
//	public List<Employee> findByDepartment(String department);
	
			
	
}
