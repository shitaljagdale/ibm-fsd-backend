package com.ibm.streamapi;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> l=new ArrayList<>();
		l.add(67);
		l.add(34);
		l.add(32);
		l.add(88);
		l.add(99);
		System.out.println(l);
		
		List<Integer> evenNum= l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		
		List<Integer> add5=l.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(add5);
		
		long noOfFail=l.stream().filter(i->i>35).count();
		System.out.println(noOfFail);
		
		//List<Integer> sortedList=l.stream().sorted((i1,i2)->(i1>i2)?+1:(i1<i2):-1:0).collect(Collectors.toList());
		List<Integer> sortedList=l.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//(i1,i2)->(i1>i2)?+1:(i1<i2):-1:0
	}
	

}
