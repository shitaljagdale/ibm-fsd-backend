package com.ibm.Annotayion;

public class AnnotationDemo {
//annotations are metadata for compiler
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationDemo annotation=new AnnotationDemo();
		annotation.sayHelllo();
		
	}
	@Author(name="shital")
	public void sayHelllo() {
		System.out.println("Hello Annotation !!");
	}

}
