package com.arkc;

public class A034_InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 b1 = new B1();
		b1.m1();
		b1.m2();

	}

}


interface A1{
	
	final int NUMBER = 10;
	 
	abstract void m1();
	abstract void m2();
}

class B1 implements A1{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
		System.out.println("from class B1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("from class B1");

		
	}
	
	
}