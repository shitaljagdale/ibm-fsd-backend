package com.ibm.exceptionhandling;
@SuppressWarnings("unused")
public class ExceptionExample {
//Exception 

	public static String getName(int id) {
		if(id==100) {
			System.out.println("shital");
		}
		else {
		    
		    fetchName();
		}
		return null;
		
	}
	public static String fetchName() {
		String name=null;
		try{
			Thread.sleep(500);
			//return name.toUpperCase();
		}catch(Exception e) {
			System.out.println("Intrupted occured");
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExceptionExample e=new ExceptionExample();
		System.out.println(getName(100));
		String[] countries= {"India","Shrilanka","US","UK"};
		System.out.println(countries[4]);
  }

}
 