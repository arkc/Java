package com.arkc;

public class A035_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.out.println(10/0);
		}

		catch(Exception e) {

			System.out.println(e);
		}

		finally {
			System.out.println("Go on.........");
		}


	}
}
