package com.arkc;

public class A024_PassingArrayToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int[] b = new int[] {20,30,40};
		
		System.out.println("before sending to method");
		System.out.println(a);
		System.out.println(b[0]);
		
		myMethod(a,b);
		
		System.out.println("after sending to method");
		System.out.println(a);
		System.out.println(b[0]);

	}
	
	public static void myMethod(int i, int[] j) {
		
		i = 5555;
		j[0] = 9999;
	}

}
