package com.example.corejava;
import java.util.Scanner;
public class EvenNumInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range");
		int count=0;
		int range=sc.nextInt();
		int i;
		for( i=0;i<range;i++) {
			if(i%2==0) {
				count++;
				System.out.println(i+" is even number");
			}
		}
		System.out.println("Total number of even number between  1 to "+ range +" is "+count );
	}

}
