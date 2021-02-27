package com.arkc;



public class A012_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		System.out.println("while loop");
		
		while(i <= 10) {
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("do-while loop");
		
		do {
			System.out.println(i);
			i--;
		}while(i>=1);
		
		System.out.println("for loop");	
		
		for(i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
