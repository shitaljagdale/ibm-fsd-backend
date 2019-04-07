package com.examples.spring.web.boot.rest.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.spring.web.boot.rest.dao.EmployeeDAO;
import com.examples.spring.web.boot.rest.model.Employee;


@Service
public class EmployeeService {

//	private static Map<Integer, Employee> employees = new LinkedHashMap<Integer, Employee>();

	@Autowired
	private EmployeeDAO employeeDao;

	public Integer add(Employee employee) {
//		int empId = employees.size() + 1;	
//		employee.setId(empId);			
//		employees.put(employee.getId(), employee);
		employeeDao.addEmployee(employee);
		return null;
	}

	public void update(Employee employee) {

//		employees.put(employee.getId(), employee);
		employeeDao.updateEmployee(employee);
	}

	public Employee get(int empId) {
		return employeeDao.getEmployeeById(empId);
	}

	public void delete(int empId) {
		employeeDao.removeEmployee(empId);
	}

	public List<Employee> list() {		
//		return new ArrayList<Employee>(employees.values());
		return employeeDao.listEmployees();
	}

}

