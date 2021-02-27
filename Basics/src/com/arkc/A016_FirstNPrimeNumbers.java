package com.arkc;

import java.util.Scanner;

public class A016_FirstNPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int primeNumberCount = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer to print those many prime numbers");
		number = input.nextInt();
		
		for(int i = 2; primeNumberCount < number; i++ ) {
			
			//System.out.println("primeNumberCount " + primeNumberCount);
			boolean j = primeNumberCheck(i);
			//System.out.println(i+"   "+j);
			
			
			if(j) {
				
				System.out.printf("%5d",i );
				primeNumberCount++;
				if(primeNumberCount % 10 == 0)
					System.out.println();
			}
				
		}

	}
	
	public static boolean primeNumberCheck(int number) {

		int count = 0;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				count++;
			}
		}

		if(count == 0)
			return true;
		else
			return false;
	}

}
