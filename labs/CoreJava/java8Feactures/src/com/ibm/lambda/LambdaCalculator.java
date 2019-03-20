package com.ibm.lambda;

import java.util.function.BiFunction;

public class LambdaCalculator {

//	interface MathOperation {
//		  public int calculate(int a,int b);
//		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LambdaCalculator obj=new LambdaCalculator();
		//MathOperation addition =(int a,int b)->a+b;
		
		//BiFunction<Integer,Integer,Integer> add=(Integer a,Integer b)->a+b;
		BiFunction<Integer,Integer,Integer> sub=(a,b)->a-b;
		BiFunction<Integer,Integer,Integer> mul=(a,b)->a*b;
		BiFunction<Integer,Integer,Integer> div=(a,b)->a/b;
		//MathOpr addition =a+b;
		System.out.println(obj.calculate(20, 10, (Integer a,Integer b)->a+b));
		System.out.println(obj.calculate(20, 10, sub));
		System.out.println(obj.calculate(20, 10, mul));
		System.out.println(obj.calculate(20, 10, div));
		
	}

	public int calculate(Integer a, Integer b ,BiFunction<Integer,Integer,Integer> mathOpr) {
		// TODO Auto-generated method stub
		return  mathOpr.apply(a, b);
	}

}
