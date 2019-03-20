package com.ibm.reflection;

public class Calculator {
	public Calculator() {
		// TODO Auto-generated constructor stub
		System.out.println("Calculator default constructor");
	}
   public Calculator(Integer a,Integer b) {
	   
   }
	public Integer result;
	public void add(Integer a,Integer b) {
		result=a+b;
		System.out.println("addition : "+result);;
	}
	public void sub(Integer a,Integer b) {
		result=a-b;
		System.out.println("Substration :"+result);;
	}
	public void  mul(Integer a,Integer b) {
		result=a*b;
		System.out.println("Multiplication :"+result);;
	}
	public void div(Integer a,Integer b) {
		result=a/b;
		System.out.println("Division :"+result);;
	}
	public String sayHello() {
		return "Hello Reflection API";
	}

}

