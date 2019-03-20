package com.ibm.collection.framwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List arryList=new ArrayList();
		//List<> arryList=new ArrayList<String>;    it's not allowed 
		
		
		for(int i=0;i<10;i++) {
			arryList.add(i);
		}
		System.out.println(arryList);
		Iterator itr=arryList.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.println(i);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(arryList);

	}

}
