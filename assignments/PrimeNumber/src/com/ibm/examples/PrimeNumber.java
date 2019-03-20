package com.ibm.examples;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int range =sc.nextInt();
	 int count=0;
      for(int i=1;i<=range;i++) {
    	  {
    		  if(range%i==0) {
    			  count++;
    		  }
    	  }
	}
      if(count==2) {
   	   System.out.println("given number is prime");
      }
      else {
   	   System.out.println("given number is not prime");
      }

}
}
//1 to 100 
//range 50 then break
