package com.arkc;

public class A018_RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.random());
		
		System.out.println(Math.random()*10); 
		
		System.out.println((int)(Math.random()*10)); // [0-9]
		
		System.out.println((int)(Math.random()*10)+1); // [1-10]
		
		System.out.println((int)(Math.random()*100)+1); // [1-100]
		
		System.out.println((int)(Math.random()*(70-10+1))+10); // [10-70] (max-min+1)
		
		System.out.println();
		for(int i = 0; i < 100; i++)
			System.out.println((int)(Math.random()*(70-10+1))+10); // [10-70] 
		
		

	}

}
