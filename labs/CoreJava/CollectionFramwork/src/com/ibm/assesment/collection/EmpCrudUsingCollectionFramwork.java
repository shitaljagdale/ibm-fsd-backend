package com.ibm.assesment.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.ibm.assesment.collection.Employee;

public class EmpCrudUsingCollectionFramwork {
	
	
public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
	//Employee<Number> empobj=new Employee<>();
     TreeSet<Employee<?>> arrlist=new TreeSet<Employee<?>>();
    
     Map<Integer, Employee<?>> empmap=new HashMap<Integer, Employee<?>>();
	
	Employee<Double> emp1=new Employee<>("Shital",1,2000.0);
	Employee<Integer> emp2=new Employee<>("Geeta",2,400);
	Employee<Float> emp3=new Employee<>("Nikung",3,240.00f);
	Employee<Integer> emp4=new Employee<>("Mitali",4,45000);
	Employee<Integer> emp5=new Employee<>("Max",5,10000);
	
    arrlist.add(emp1);
	arrlist.add(emp2);
	arrlist.add(emp3);
	arrlist.add(emp4);
	arrlist.add(emp5);
	
	empmap.put(100,emp1);
	empmap.put(200,emp2);
	empmap.put(300,emp3);
	empmap.put(400,emp4);
	empmap.put(500,emp5);
	
	System.out.println("---------employees List in hashmap----------");
	//System.out.println(empmap.entrySet());
	//Object empEntrys=empmap.entrySet();
	for(Object emp:empmap.values()) {
		System.out.println(emp);
	}
	//update
//	System.out.println("---------employees update in map----------");
//	emp5.setSalary(1222);
//	arrlist.put(101,emp5);
	//delete  map 1 emp
	//empmap.get(200);
	System.out.println("Employee whose key is 200 " +empmap.get(200));
	                              
	empmap.remove(100);
	
	System.out.println("----------after deletion from hashmap----------");
	System.out.println(empmap);
	
	
	System.out.println("---------employees List----------");
	for(Object obj:arrlist) {
		System.out.println(obj);
	}
	
	System.out.println("---------employees deleted----------");
	arrlist.remove(emp3);
	for(Object obj:arrlist) {
		System.out.println(obj);
	}
	System.out.println("---------employees sorted according to name----------");
	for(Object obj:arrlist) {
		System.out.println(obj);
	}
	System.out.println("---------get employees according to some condition ----------");
	for(Object obj:arrlist) {
		if(((Employee<?>) obj).getName()=="Shital") {
			
			System.out.println(obj);
		}
	}
	System.out.println("--------Update employee ----------");
	for(Object obj:arrlist) {
		if(((Employee<?>) obj).getId()==1) {
			((Employee<?>) obj).setName("Updated shital");
		}
		System.out.println(obj);
	}

	}
	
	}


