package com.ibm.collection.framwork.List;

public class Employee implements Comparable  {
	private String name;
	private int id;
	private int sal;
	
	public Employee() {
		
	}
	
	@Override
	public int hashCode() {
		return this.getId()%5;
	}

	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public Employee(String name, int id, int sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Employee) {
			return this.getName().compareTo(((Employee) o).getName());
		}
		return 0;
	}

}
