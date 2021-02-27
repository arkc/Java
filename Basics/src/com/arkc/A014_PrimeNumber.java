package com.arkc;

import java.util.Scanner;

public class A014_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;

		Scanner input = new Scanner(System.in);

		System.out.println("enter an integer to check for prime number");

		number = input.nextInt();
		
		primeNumberCheck(number);
	}

	public static void primeNumberCheck(int number) {

		int count = 0;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				count++;
			}
		}

		if(count == 0)
			System.out.println("prime");
		else
			System.out.println("Not Prime");
		
		System.out.println(count);
	}

}
