package com.ibm.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		MethodReference methodrefobj=new MethodReference();
		// TODO Auto-generated method stub
		String[] countriesArr= {"IND","US","UK","AUS"};
		Collection<String> countries=Arrays.asList(countriesArr);
		
		//for each with static
		//countries.forEach((String item)->MethodReference.displayItem(item));
		
		//for each with method reference  for static method
		//countries.forEach(MethodReference::displayItem);
		
		//for each with instance method we have to create object of class 
		countries.forEach(methodrefobj::displayItem);
		//Lambda expression to create arraylist
		Supplier<List<String>> countryList=()->{return new ArrayList<>();};
		List<String> l=countryList.get();
		System.out.println(l);
		
		//invoke constructor
		Supplier<List<String>> countryList1=ArrayList::new;
		List<String> l1=countryList1.get();
		System.out.println(l1);
	}
	
	public  void displayItem(String item) {
		System.out.println(item);
	}


}
