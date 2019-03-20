package com.ibm.innerclass;

import com.ibm.innerclass.OuterClass.innerClass;

public class Shadowing {

	public int x=0;
	public class innerClass{
		int x=1;
		
		void innermethod(int x) {
			System.out.println(x);
			System.out.println(this.x);
			//System.out.println(Shadowing.x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shadowing shadowObj=new Shadowing();
		Shadowing.innerClass innerobj=shadowObj.new innerClass();
		innerobj.innermethod(23);
	}

}
