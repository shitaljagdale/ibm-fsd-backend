package com.example.corejava;

public class HelloWorld {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		//data types
		//byte,short,long,int ,float,double ,char,string,boolean
		//1    2     4    4    4     8       2           1
		//Non primitive data types Array, String ,Object
		int a=1;
		System.out.println(a++);//1
		System.out.println(++a);//3
		
		int b=2;//0010
		int c=2;//0010
		System.out.println(b& c);//2 (and between b and c )
		
		//diff between variable and literals??
		int val=2;
		switch(val) {
		case 1:
			System.out.println("case 1");
			break;
		
		case 2:
			System.out.println("case2");
			break;
			
		default:
			System.out.println("default case");
			
		}
		//assignment
		//1prime number
		//1odd even in perticular range how many num are even 
		//1swap 2 num
		
		int num=5;
		if(num>=0)
		System.out.println("a");
		else
			System.out.println("b");
		System.out.println("c");
				
	}

}
