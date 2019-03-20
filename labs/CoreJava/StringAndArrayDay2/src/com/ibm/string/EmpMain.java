package com.ibm.string;

public class EmpMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e1=new Employee();
		//Persone p=new Persone("shital",23);
		Employee e2=new Employee("Shital",23,"Female",1,25000,"IT","devloper");
		
		//e1.showEmpDetails("Shital",1,25000,"IT",22);
		//e2.showEmpDetails(1,1234,"IT");
		e2.showEmpDetails();
		//e2.updateEmp("shital",1,1234,"IT",22);
		Contractor c=new Contractor(100,4000,4);
		c.showContractorDetails();
		//Persone p=new Employee();
		Appraisable appr=new Employee();
		appr.appraise();
	}


}
