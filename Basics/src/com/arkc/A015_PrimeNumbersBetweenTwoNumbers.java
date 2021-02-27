package com.arkc;

import java.util.Scanner;

public class A015_PrimeNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1, number2;

		Scanner input = new Scanner(System.in);

		System.out.println("enter two integers to show prime numbers b/w them");

		number1 = input.nextInt();
		number2 = input.nextInt();


		for(int i = number1; i <= number2; i++) {

			if(i <= 1)
				continue;

			primeNumberCheck(i);
		}
	}

	public static void primeNumberCheck(int number) {

		int count = 0;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				count++;
			}
		}

		if(count == 0)
			System.out.println(" " + number);
	}

}
