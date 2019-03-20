package com.ibm.defaultmethods;

public interface DefaultMethodInterface {
	default public void say() {
		System.out.println("Default method ");
	}

}

