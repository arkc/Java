package com.arkc;
import java.util.*;

public class A036_CustomException {

	public static void main(String[] args) throws CustomException {
		// TODO Auto-generated method stub
		
		System.out.println("enter majority age");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if(age < 18) {
			throw new CustomException("Wrong input");
		}
	}

}

class CustomException extends Exception{

	public CustomException(String message) {
		super(message);
	}
}