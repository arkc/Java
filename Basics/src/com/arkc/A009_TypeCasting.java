package com.arkc;

public class A009_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Multiplication of 3 and 4.0\n");
		System.out.println("IMPLICIT type casting: " + 3 * 4.0);
		System.out.println("integer 3 is IMPLICITLY converted by JAVA to float/double");
		System.out.println("\nWhen mixed datatypes invove in an expression,\nJAVA automatically casts lower-range datatype to higher-range datatype (WIDEN a TYPE)");
		
		System.out.println("\nprinting of 12.3456");
		System.out.println("without EXPLICIT casting: " + 12.3456);
		System.out.println("with EXPLICIT casting: " + (int)12.3456 + " (NARROWING a TYPE)");
		
		
		System.out.println("\nvalue of 10/3: " + 10/3);
		System.out.println("value of 10/3: " + 10.0/3);
		System.out.println("value of 10/3: " + 10/3.0);
		System.out.println("value of 10/3: " + (double)10/3);
		

	}

}
