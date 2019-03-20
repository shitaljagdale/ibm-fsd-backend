package com.ibm.serilization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//serialization 
public class SerilizationDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		e.id=101;
		e.name="shital";
		e.uid=1111;
		e.salary=80000;
		
		FileOutputStream fs=new FileOutputStream("C:\\Users\\ShitalBJadhav\\Downloads\\serilize.ser");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(e);
		os.close();
		fs.close();
		
		System.out.println("Data saved");
	}

}
                                                                                                                                                                                                                                                                                                                                