package com.ibm.generics;
//Strict type check at compile time only
//get rid of typecasting 
public class GenericsEx<T>{
	private T t;
	private int a;
	public void add(T t,int a) {
		this.t=t;
		this.a=a;
	}
	
	public T get(){
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		GenericsEx<Integer> integerObj=new GenericsEx<Integer>();
		integerObj.add(new Integer(10),10);
		//integerObj.add(10.0);
		System.out.println(integerObj.get());
		System.out.println();
	}

}
