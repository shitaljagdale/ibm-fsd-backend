package com.ibm.exceptionhandling;
import java.util.Scanner;
public class IOClass {

	public int add(int a,int b) {
		return a+b;
	}
	//var args methods
	public int add(int... args) {
		int sum=0;
		for(int a:args) {
			sum=sum+a;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name :");
//		String name=sc.next();
//		System.out.println("Enter Age :");
//		int age=sc.nextInt();
//		System.out.println("Enter Desiganetion :");
//		String desiganation=sc.next();
//		System.out.println("Name: "+name+" age: "+age+" desiganation: "+desiganation);
//		System.out.format("Name \t age \t desiganation \n");
//		System.out.format("%s \t %d \t %s \n",name,age,desiganation);
//
//		sc.close();
		IOClass i=new IOClass();
		System.out.println(i.add(20,23,22));
	}

}
