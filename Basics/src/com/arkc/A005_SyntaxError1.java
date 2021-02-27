package com.arkc;

public class A005_SyntaxError1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For multiple variables, can not declare and initiate at the same time
		//		int i = j = k = 1;				


		// Do this instead 
		int i,j,k; 
		i = j = k = 1;


		System.out.println(i + " " + j + " " + k);

	}

}
