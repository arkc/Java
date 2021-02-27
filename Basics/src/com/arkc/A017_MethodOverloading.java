package com.arkc;

public class A017_MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMax(10,20);
		printMax(10.3,0.8);
		printMax(10,20,30.9);
		
		//Method overloading
		//Same method name. datatype of args and/or number of args can change.
	}

	public static void printMax(int i, int j) {

		if(i > j)
			System.out.println("Max of " + i +","+ j + " is " + i);
		else
			System.out.println("Max of " + i +","+ j + " is " + j);
	}

	public static void printMax(double i, double j) {

		if(i > j)
			System.out.println("Max of " + i +","+ j + " is " + i);
		else
			System.out.println("Max of " + i +","+ j + " is " + j);
	}

	public static void printMax(double i, double j, double k) {

		if(i > j && i > k)
			System.out.println("Max of " + i +","+ j +","+ k + " is " + i);
		else if(j > i && j > k)
			System.out.println("Max of " + i +","+ j +","+ k + " is " + j);
		else
			System.out.println("Max of " + i +","+ j +","+ k + " is " + k);
	}

}
