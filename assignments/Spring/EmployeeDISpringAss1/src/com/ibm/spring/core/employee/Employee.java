package com.ibm.spring.core.employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String designation;
	private double salary;
	private List skills;
	private Address address;
	boolean fulltime;
	private LocalDate dob;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

   

	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public void testMe(){
        System.out.println("Employee: Doj: "+this.dob);
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List getSkills() {
		return skills;
	}
	public void setSkills(List skills) {
		this.skills = skills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public boolean isFulltime() {
		return fulltime;
	}
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}
	
	public void printDetails() {
		System.out.println("Employee id : "+getId());
		System.out.println("Employee name : "+getName());
		System.out.println("Employee age : "+getAge());
		System.out.println("Employee designation : "+getDesignation());
		System.out.println("Employee salary : "+getSalary());
		System.out.println("Employee skills : "+getSkills());
		System.out.println("Employee address : "+getAddress());
		System.out.println("Employee fulltime or not : "+isFulltime());
		System.out.println("DOB: "+getDob());
	}
	
	
	
	

}
