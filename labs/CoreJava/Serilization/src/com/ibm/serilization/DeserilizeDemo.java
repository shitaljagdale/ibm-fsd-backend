package com.ibm.serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizeDemo {
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee emp=null;
		FileInputStream filein=new FileInputStream("C:\\Users\\ShitalBJadhav\\Downloads\\serilize.ser");
		ObjectInputStream in=new ObjectInputStream(filein);
		emp = (Employee) in.readObject();
		in.close();
		filein.close();
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		System.out.println(emp.uid);
		System.out.println(emp.salary);

	}

}
