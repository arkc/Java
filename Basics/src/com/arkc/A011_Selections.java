package com.arkc;

import java.util.Scanner;

public class A011_Selections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter student marks");
		Scanner input = new Scanner(System.in);
		double marks = input.nextDouble();	
	
		
		if(marks >= 0 && marks <= 50) {
			System.out.println("Grade F");
		}
		else if(marks > 50 && marks <= 60) {
			System.out.println("Grade D");
		}
		else if(marks > 60 && marks <= 70) {
			System.out.println("Grade C");
		}
		else if(marks > 70 && marks <= 80) {
			System.out.println("Grade B");
		}
		else if(marks > 80 && marks <= 100) {
			System.out.println("Grade A");
		}
		else {
			System.out.println("invalid entry");
		}
		
		System.out.println("Enter 1-7 to get the day of the week");
		int day = input.nextInt();
		switch(day) {
		case 1 : System.out.println("Sunday");break;
		case 2 : System.out.println("Monday");break;
		case 3 : System.out.println("Tuesday");break;
		case 4 : System.out.println("Wednesday");break;
		case 5 : System.out.println("Thursday");break;
		case 6 : System.out.println("Friday");break;
		case 7 : System.out.println("Saturday");break;
		default : System.out.println("invalid");
		}
		
		
		
		

	}

}
