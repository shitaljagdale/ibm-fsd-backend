package com.ibm.defaultmethods;

public class MainClass implements DefaultMethodI1, DefaultMethodInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass obj=new MainClass();
		obj.say();

	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		DefaultMethodInterface.super.say();
		DefaultMethodI1.super.say();
		System.out.println("Overridden default method");
	}

}
