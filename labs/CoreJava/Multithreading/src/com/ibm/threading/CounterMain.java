package com.ibm.threading;

public class CounterMain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Counter counterobj=new Counter();
          counterobj.increment();
          counterobj.decrement();
          counterobj.increment();
          counterobj.increment();
          
          System.out.println(counterobj.value());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
