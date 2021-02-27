package com.arkc;

import java.util.Scanner;

public class A013_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int result;
		
		System.out.println("enter two numbers to get sum between them");
		
		Scanner input = new Scanner(System.in);
		
		i = input.nextInt();
		j = input.nextInt();
		
		
		result = sumBetweenTwoIntegers(i,j);
		
		System.out.println("Result is: " + result);

	}
	
	 static int sumBetweenTwoIntegers(int i, int j) {
		
		int result = 0;
		
		for (;i<=j;i++) {
			result = i + result;
		}
		
		return result;
	}

}
