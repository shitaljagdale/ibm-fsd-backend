package com.ibm.jsp.servlet;

import java.util.List;

public class Emp {
private int id,salary;
private String name,password,email,country,designation,department;

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
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
public List<String> getSkills() {
	return skills;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", salary=" + salary + ", name=" + name + ", password=" + password + ", email=" + email
			+ ", country=" + country + ", designation=" + designation + ", department=" + department + ", skills="
			+ skills + "]";
}
public void setSkills(List<String> skills) {
	this.skills = skills;
}
private List<String> skills;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

}
