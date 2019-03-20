package com.ibm.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream  fs=null;
		FileOutputStream  out = null;
		try {
			fs=new FileInputStream("C:\\Users\\ShitalBJadhav\\Downloads\\file1.txt");
			out=new FileOutputStream("C:\\Users\\ShitalBJadhav\\Downloads\\outputfile.txt");
			int c;
			while((c=fs.read())!=-1) {
				System.out.print((char)c);
				out.write(c);
			}
			System.out.println("Finally added");
		}
		finally {
			if(fs!=null) {
				fs.close();
			}
			if(out!=null) {
				out.close();
			}
		}

	}

}
