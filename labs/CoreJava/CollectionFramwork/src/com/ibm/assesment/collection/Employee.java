package com.ibm.assesment.collection;

public class Employee<T extends Number> implements Comparable<Object>{
	//private T t;
	

	private String name;
	private int id;
	private T salary;
	
	
	public Employee() {
		
	}
	
	//
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}


	public Employee(String name, int id, T salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
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

	public T getSalary() {
		return salary;
	}

	public void setSalary(T salary) {
		this.salary = salary;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Employee) {
			return this.getName().compareTo(((Employee<?>) o).getName());
		}
		return 0;
	}
	
//	public void addEmp(){
//		arrlist.add(emp1);
//		arrlist.add(emp2);
//		arrlist.add(emp3);
//		arrlist.add(emp4);
//		arrlist.add(emp5);
//		System.out.println("----------Employee added----------");
//		System.out.println(arrlist);
//		
//		
//	}
//	
	
	

}
