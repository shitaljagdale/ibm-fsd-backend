package com.ibm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class<?> c=Class.forName("com.ibm.reflection.Calculator");
			//Class<?> c=Calculator.class;
			System.out.println(c);
			
			//parameterized constructure
			//Constructor<?> constr=c.getConstructor(Integer.class,Integer.class);
		
			Constructor<?> constr=c.getConstructor();
			System.out.println(constr);
			
			Object obj=constr.newInstance();
			
			Method add=c.getMethod("add", Integer.class,Integer.class);
			add.invoke(obj, 90,10);
			
			Method sub=c.getMethod("sub", Integer.class,Integer.class);
			sub.invoke(obj, 90,10);
			
			Method mul=c.getMethod("mul", Integer.class,Integer.class);
			mul.invoke(obj, 90,10);
			
			Method div=c.getMethod("div", Integer.class,Integer.class);
			div.invoke(obj, 90,10);
			
			Method sayHello=c.getMethod("sayHello");
			String s=(String) sayHello.invoke(obj);
			System.out.println(s);
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
