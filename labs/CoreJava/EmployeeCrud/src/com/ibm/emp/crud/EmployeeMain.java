package com.ibm.emp.crud;
import java.util.*;
import java.util.Arrays;

public class EmployeeMain {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		//emp.addEmpDetails();
		//Object a=new Employee();
		
		Employee[] empObj = new Employee[4];
	    
		
		 empObj[0]=new Employee(1,"test",500);
		 empObj[3]=new Employee(4,"shital",9900);
		 
		 empObj[1]=new Employee(2,"shital",700);
		 empObj[2]=new Employee(3,"geeta",900);
		
		 
		
		 for(Employee e:empObj) {
			 System.out.println("Id : "+e.getId());
			 System.out.println("name : "+e.getName());
			 System.out.println("Sal : "+e.getSal());
		 }
		  System.out.println("------------------------");
		 System.out.println("updated Employee details : ");
		 for(Employee e:empObj) {
			 empObj[0].setId(100);
			 empObj[0].setName("Bob");
			 empObj[0].setSal(20000);
			 System.out.println("id "+e.getId()+" name "+e.getName()+" Sal "+e.getSal());
		 }
		 System.out.println("------------------------");
		 System.out.println("Search according to name");
		 for(Employee e:empObj) {
			 if(e.getName()=="shital") {
				 System.out.println("Id "+e.getId()+" Name "+e.getName()+" Sal "+e.getSal());
				 
			 }
		 }
		 
//		 System.out.println("------------------------");
//		 System.out.println("sort array element"); 
//		 Arrays.sort(empObj);
//		 for(Employee e:empObj) {
//			 System.out.println("Id : "+e.getId());
//			 System.out.println("name : "+e.getName());
//			 System.out.println("Sal : "+e.getSal());
//		 }
		 
	 System.out.println("------------------------");
		 System.out.println("delete  array element");
		 empObj[1]=null;
		 for(Employee e:empObj) {
			if(e!=null) {
				System.out.println("Id : "+e.getId());
				 System.out.println("name : "+e.getName());
				 System.out.println("Sal : "+e.getSal());
			}
			 
		 }
		

      }
	}


