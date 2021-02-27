package com.arkc;

public class A032_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		
		p.m1();
		c.m1();
		
		ParentClass p1 = new ChildClass();
		
		System.out.println(p1.i);
		p1.m1();
		
	}
	
}
	
	class ParentClass{
		
		int i = 10;
		
		void m1() {
			System.out.println("From ParentClass");
		}
	}
	
	class ChildClass extends ParentClass{
		
		int j = 20;
		
		void m1() {
			
			System.out.println("From ChildClass");
		}
	}

