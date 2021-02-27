package com.arkc;
import java.util.*;

public class A006_AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter circle radius");

		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();

//		double radius = new Scanner(System.in).nextDouble();

		double area = Math.PI * radius * radius;

		System.out.println("Circle area is: " + area);


	}

}
