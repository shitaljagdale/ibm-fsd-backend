package com.ibm.string;

public class Employee extends Persone implements Appraisable{

	
	private static int empId;
	private int empSal;
	private String dept;
	private String desiganation;
	
	public Employee(){
		System.out.println("Default constructor called");
		
	}
	public Employee(String name,int age,String gender,int empId,int empSal,String dept,String desiganetion) {
		
		super(name,age,gender);
		//	this.empId=empId;
			this.empSal=empSal;
			this.dept=dept;
			this.desiganation=desiganetion;
		}
	
	
public static int getEmpId() {
		return empId;
	}
	public static void setEmpId(int empId) {
		Employee.empId = empId;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesiganation() {
		return desiganation;
	}
	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}
	//public void showEmpDetails(String empName,int empId,int empSal,String dept,int age)
	public void showEmpDetails()
	{
		
		empId++;
		System.out.println("Employee details are :");
		System.out.println("Employee name :"+this.getName());
		System.out.println("Employee age : "+this.getAge());
		System.out.println("Employee gender: "+this.getGender());
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Salary: "+empSal);
		System.out.println("Employee Dept : "+dept);
		System.out.println();
		
	}
	public void updateEmp(int empId,int empSal,String dept) {
		//Employee.empId=4;
		System.out.println("updated details");
		
		//empId=2;
		empSal=30000;
		dept="CS";
	
		System.out.println("Id :"+empId);
		System.out.println("Sal :"+empSal);
		System.out.println("Dept :"+dept);
}
	@Override
	public void appraise() {
		// TODO Auto-generated method stub
		System.out.println("Employee appricial");
	}
	
}
//Employee