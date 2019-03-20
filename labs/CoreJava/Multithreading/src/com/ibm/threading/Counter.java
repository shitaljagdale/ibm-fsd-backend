package com.ibm.threading;

public class Counter {
	
	private int count;
	public void increment() {
		count++;
	}
	public void decrement() {
		count--;
		
	}
	public int value() {
		return count;
	}
}
