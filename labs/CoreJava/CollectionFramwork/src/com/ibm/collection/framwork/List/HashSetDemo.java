package com.ibm.collection.framwork.List;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// soring according to natural sorting 
		HashSet hashset=new HashSet();
		hashset.add("India");
		hashset.add("Shrilanka");
		hashset.add("Austrliya");
		hashset.add("US");
		
		System.out.println(hashset);
		
		//insert according to insertion order
		LinkedHashSet linkhashset=new LinkedHashSet();
		linkhashset.add("India");
		linkhashset.add("Shrilanka");
		linkhashset.add("Austreliya");
		linkhashset.add("US");
		linkhashset.add("US");
		
		
		System.out.println(linkhashset);
		
	}

}
