package com.ibm.collection.framwork.List;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public int hashCode(){
		System.out.println("Overriden hashcode method ");
		 return 0;
		
	}

	public static void main(String[] args) {
		Employee emp=new Employee();
		Employee empArr1=new Employee("shital",100,30000);
		Employee empArr2=new Employee("Max",101,80000);
		Employee empArr3=new Employee("Bob",108,80000);
		Employee empArr4=new Employee("jhon",103,390000);
		//Employee empArr4=empArr3;
		TreeSetDemo obj=new TreeSetDemo();
		// TODO Auto-generated method stub
	//	HashSet set=new HashSet();
		
		
	 TreeSet set=new TreeSet();
	 
//		set.add(1);
//		set.add("shital");
//		set.add(2);
//		set.add(3);
//		set.add(3);
//		set.add(9);
		//System.out.println(emp.hashCode());
		set.add(empArr1);
		set.add(empArr2);
		set.add(empArr3);
		
		set.add(empArr4);
		//System.out.println(set);
		
		for(Object o:set) {
			//System.out.println(o +" hashcode is "+o.hashCode());
			System.out.println(o);
		}

		//hashcode of 2 obj may be same but .equals() return false
		System.out.println(empArr3.equals(empArr4));
	}
	
	

}
