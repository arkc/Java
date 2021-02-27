package com.arkc;
import java.util.*;

public class A026_ArraysClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {1,12,3,4,5};
		int[] array2 = {6,7,8,9,0};
		
		// SORT 
		Arrays.parallelSort(array1);
		
		for(int e:array1)
			System.out.println(e);
		
		// SEARCH
		int index = Arrays.binarySearch(array1, 12);
		System.out.println("index of element 12 = "+index);
		
		//EQUAL CHECK
		boolean check = Arrays.equals(array1, array2);
		System.out.println("array1 = array2 ? "+check);
		
		//FILL
		Arrays.fill(array2,2,4,100);
		
		for(int e:array2)
			System.out.println(e);
		
		//toString
		String s = Arrays.toString(array1);
		System.out.println(s);
		
		

	}

}
