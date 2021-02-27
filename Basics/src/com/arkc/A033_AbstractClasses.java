package com.arkc;

public class A033_AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		B b = new B();
		
		b.m1();
		b.m2();

	}

}


abstract class A{
	
	void m1(){
		
		System.out.println("From abstract class A...");
		
	}
	
	abstract void m2();
}

class B extends A{
	
	void m2() {
		
		System.out.println("abstract method implementation in subclass");
	}
}