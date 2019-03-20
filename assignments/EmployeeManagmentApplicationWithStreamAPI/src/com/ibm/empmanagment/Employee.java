package com.ibm.empmanagment;
import java.io.Serializable;
import java.time.LocalDate;
//
public class Employee implements Comparable<Object>,Serializable{
	private int id;
	private String name;
	private int  age;
	private String desiganation;
	private String department;
	private double salary;
	private LocalDate DOB ;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name, int age, String desiganation, String department, double salary,
			LocalDate DOB) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.desiganation = desiganation;
		this.department = department;
		this.salary = salary;
		this.DOB = DOB;
	}

    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
				+ ", department=" + department + ", salary=" + salary + ", DOB=" + DOB + "]";
	}

   public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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
   
  public String getDesiganation() {
		return desiganation;
	}

	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	};
	
	public void sayHEllo() {
		System.out.println("Hello");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Employee) {
			//sorting according to name
			return this.getName().compareTo(((Employee) o).getName());
			
			//sorting according to id
			//return this.getId()-((Employee) o).getId();
		}
		return 0;
	}
	
	
	

}
