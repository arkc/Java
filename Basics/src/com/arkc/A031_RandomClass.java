package com.arkc;

import java.util.Random;

public class A031_RandomClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r1 = new Random();
		
		System.out.println("r1.nextInt(10)  "+r1.nextInt(10));
		System.out.println("r1.nextInt(10)  "+r1.nextInt(10));
		
		System.out.println("Printing same random numbers using SEED");
		
		Random r2 = new Random(1);
		
		System.out.println("r2.nextInt(10)  "+r2.nextInt(10));
		System.out.println("r2.nextInt(10)  "+r2.nextInt(10));
		
		
		Random r3 = new Random(1);
		Random r4 = new Random(1);
		
		
		for(int i=0; i<10; i++) 
			System.out.print("  "+r3.nextInt(10));
		
		System.out.println();
		for(int i=0; i<10; i++) 
			System.out.print("  "+r4.nextInt(10));

	}

}
