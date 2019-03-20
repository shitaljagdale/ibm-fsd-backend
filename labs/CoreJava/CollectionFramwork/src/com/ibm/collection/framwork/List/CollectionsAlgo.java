package com.ibm.collection.framwork.List;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionsAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Employee empArr1=new Employee("shital",100,30000);
		Employee empArr2=new Employee("Max",101,80000);
		Employee empArr3=new Employee("Bob",108,80000);
		Employee empArr4=new Employee("jhon",103,390000);
		//Employee empArr4=empArr3;
		 HashSet hashset=new HashSet();
		 hashset.add(empArr1);
		 hashset.add(empArr2);
		 hashset.add(empArr3);
		 
		 for(Object o:hashset) {
			 System.out.println(o);
		 }
//		List emps= Collections.unmodifiableCollection(hashset);
//		 emps.add("d");
	}

}
