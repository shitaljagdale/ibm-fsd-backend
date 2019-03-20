package com.ibm.collection.framwork.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.ibm.assesment.collection.Employee;

public class MapExample  {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map empmap=new TreeMap();
		Employee emp1=new Employee("Shital",1,20000);
		Employee emp2=new Employee("Geeta",2,40000);
		Employee emp3=new Employee("Nikung",3,24000);
		Employee emp4=new Employee("Mitali",4,45000);
		Employee emp5=new Employee("Max",5,10000);
		
		empmap.put(100,new Employee("Shital",1,20000));
		empmap.put(200,emp2);
		empmap.put(300,emp3);
		empmap.put(400,emp4);
		empmap.put(500,emp5);

		List empSorted=new ArrayList(empmap.values());
	//	Collections.sort(empSorted,List_Emp_Comparator);//write metod 
		for(Object obj:empmap.values()) {
			Employee emp=(Employee) obj;
			System.out.println(emp);
		}
		
		
	}

}
