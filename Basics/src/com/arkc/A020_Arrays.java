package com.arkc;

import java.util.Scanner;

public class A020_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,20,30,40};
		
		for(int i = 0; i < a.length; i++)
			System.out.println(a[i]);
		
		int[] aa = new int[]{1330,240,330,420};
		
		for(int i = 0; i < aa.length; i++)
			System.out.println(aa[i]);
		
		
		int[] b = new int[6];
		
		b[0] = 1; 
		b[1] = 1;
		b[2] = 1;
		b[3] = 1;
		b[4] = 1;
		b[5] = 9;
		
		for(int i = 0; i < b.length; i++)
			System.out.println(b[i]);
		
		
		int[] c = new int[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < c.length; i++)
			c[i] = input.nextInt();
		
		for(int i = 0; i < c.length; i++)
			System.out.println(c[i]);

	}

}
