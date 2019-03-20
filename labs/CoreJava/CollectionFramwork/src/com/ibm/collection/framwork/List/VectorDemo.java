package com.ibm.collection.framwork.List;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector
		
		Vector countries=new Vector();
		countries.add("India");
		countries.add("Chaina");
		countries.add("Shrilanka");
		
		//add collection of element
	/*	for(int i=0;i<50;i++) {
			countries.add("India"+i);
		}*/
		System.out.println(countries.size());
		System.out.println(countries.get(1));
		
		for(Object str:countries) {
			System.out.println(str);
			
		}
		System.out.println("--------------After removing ----------");
		countries.remove(0);
		for(Object str:countries) {
			System.out.println(str);
			
		}
		System.out.println(countries.size());
		System.out.println("--------------After converting to toArray() ----------");
		Object countriesArry[]=countries.toArray();
		for(Object arry:countriesArry) {
			System.out.println(arry);
			
		}
		
		//Vector arryToVector=(Vector) Arrays.asList(countriesArry);
		//System.out.println(arryToVector);
	}

}
