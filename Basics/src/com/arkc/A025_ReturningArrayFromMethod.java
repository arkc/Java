package com.arkc;

public class A025_ReturningArrayFromMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40};
		int[] b;
		
		System.out.println("Before method call");
		for(int e:a)
			System.out.println(e);
		
		b = reverseArrayElements(a);
		
		System.out.println("After method call");
		for(int e:b)
			System.out.println(e);
	}
	
	public static int[] reverseArrayElements(int[] c) {
		
		int[] d = new int[c.length];
		int i,j;
		
		for(i = 0,j = c.length-1; i < c.length; i++,j--) {
			
			d[j] = c[i];
		}
		
		return d;
	}

}
