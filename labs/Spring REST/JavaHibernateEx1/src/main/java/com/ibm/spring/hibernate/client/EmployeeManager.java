package com.ibm.spring.hibernate.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ibm.spring.hibernate.model.Employee;

public class EmployeeManager {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1> create configuration
				Configuration config=new Configuration();
				//try to load default configuration file ex. hibernate-cfg.xml
				config.configure();
				
			  
				//2>	create session factory
				SessionFactory sessionFactory=config.buildSessionFactory();
				
		System.out.println(sessionFactory);
		
		//3>
		
		Session session=sessionFactory.openSession();
		Transaction tnx=session.beginTransaction();
		List<Employee> empList=new ArrayList<Employee>();
		
		
		Employee emp=new Employee();
		emp.setName("shital");
		emp.setAge(23);
		emp.setSkills("JAVA");
		emp.setAddress("Maharashtra");
		emp.setCountry("India");
		emp.setDepartment("IT");
		emp.setDesignation("Devloper");
		emp.setContractor("yes");
		
		//session.save(emp);
		
		tnx.commit();
		
		System.out.println("employee inserted..");
		for(Iterator<Employee> itr=empList.iterator();itr.hasNext();) {
			Employee employee=itr.next();
		   System.out.println("Employee name :"+employee.getName());
		}
		//update
		Transaction tnx1=session.beginTransaction();
		Employee empForUpdate=session.get(Employee.class, 1);
		empForUpdate.setDepartment("CO");;
		session.update(empForUpdate);
		tnx1.commit();
		System.out.println("Updated record");
		
		//delete
		Employee empForDelete=session.get(Employee.class, 1);
		session.delete(empForDelete);
		tnx.commit();
		
		
	}

}
