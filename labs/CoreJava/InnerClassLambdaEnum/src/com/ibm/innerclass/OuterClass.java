package com.ibm.innerclass;
//while compiling this class 3 .class file generated 
// 1 for OuterClass.class ,innerClass.class ,i.class

//neted class=static member
//innerclass =non static class
public class OuterClass  {
	int a=10;
	//interface inside class
	public interface i{
		void test();
	}
	//class inside class
	public class innerClass implements i{
		
		public innerClass()  {
			// TODO Auto-generated constructor stub
		}
		public void sayHello() {
			//inner most class can access outer class variable like a
			System.out.println("Hello inner class" +a);
		}
		@Override
		public void test() {
			// TODO Auto-generated method stub
			System.out.println("Overriding test method");
			
		}
		
	}
	//enum is also member of class
	enum days {};
	
	public static void main(String[] args) {
		OuterClass outer=new OuterClass();
		//static inner class we can access using classname
		//InnerClassDemo.insideClass innerobj=new InnerClassDemo.insideClass();
		//innerobj.sayHello();
		
		//non static inner class we can access using outer class obj
		
		OuterClass.innerClass innerobj=outer.new innerClass();
		innerobj.sayHello();
		
	}
}
