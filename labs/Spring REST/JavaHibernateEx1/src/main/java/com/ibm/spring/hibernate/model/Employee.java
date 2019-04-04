package com.ibm.spring.hibernate.model;

public class Employee {

	private Integer id;
	private String name;
	private Integer age ;
	private String gender;
	private String contractor;
	private String skills;	
	private String designation;
	private String department;
	private String address;
	private String country;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContractor() {
		return contractor;
	}
	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", contractor="
				+ contractor + ", skills=" + skills + ", designation=" + designation + ", department=" + department
				+ ", address=" + address + ", country=" + country + "]";
	}	

	

	
}

