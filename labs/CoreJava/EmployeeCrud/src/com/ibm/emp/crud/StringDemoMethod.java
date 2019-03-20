package com.ibm.emp.crud;

import java.util.StringTokenizer;

public class StringDemoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String tokenizer for split the string according to delimeter
		String s1="Hi,How,Are,You";
		StringTokenizer token =new StringTokenizer(s1,",");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		//String ,String Builder,String Buffer(Thread safe)
	String msg="one";
	msg="two";
	System.out.println(msg);
	StringBuilder strBuild=new StringBuilder("hello World");
	strBuild.append(" Welcome");
	System.out.println(strBuild);

	}
}
