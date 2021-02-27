package com.arkc;

public class A023_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4};
		int[] b = a;  //  takes same reference
		
		System.out.println(a);
		for(int e:a)
			System.out.println(e);
		
		System.out.println(b);
		for(int e:b)
			System.out.println(e);
		
		int[] c = {1,2};
		int[] d = new int[4];
		
		d = c; //  takes same reference
		
		System.out.println(c);
		for(int e:c)
			System.out.println(e);
		
		System.out.println(d);
		for(int e:d)
			System.out.println(e);
		
		// COPYTING CONTENT FROM ONE ARRAY TO OTHER
		
		int[] srcArr = {10,20,30};
		int[] tgtArr = new int[srcArr.length];
		
		for(int i = 0; i < srcArr.length; i++)
			tgtArr[i] = srcArr[i];
		
		System.out.println(srcArr);
		for(int e:srcArr)
			System.out.println(e);
		
		System.out.println(tgtArr);
		for(int e:tgtArr)
			System.out.println(e);
		
		// using built-in arraycopy method
		
		int[] srcArr1 = {1000,2000,3000};
		int[] tgtArr1 = new int[srcArr1.length + 2];
		
		System.arraycopy(srcArr1, 0, tgtArr1, 2, srcArr1.length);
		
		System.out.println(srcArr1);
		for(int e:srcArr1)
			System.out.println(e);
		
		System.out.println(tgtArr1);
		for(int e:tgtArr1)
			System.out.println(e);
		

	}

}
