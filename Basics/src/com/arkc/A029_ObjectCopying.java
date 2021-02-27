package com.arkc;

public class A029_ObjectCopying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Bob",32);
		Person p2 = new Person("Alice",29);
		
		
		System.out.println("Before equal operation");
		System.out.println("p1 = "+ p1);
		System.out.println("p1.name = "+ p1.name);
		System.out.println("p1.age = "+ p1.age);
		System.out.println("p2 = "+ p2);
		System.out.println("p2.name = "+ p2.name);
		System.out.println("p2.age = "+ p2.age);
		
		p2 = p1;
		
		System.out.println("\n\nAfter equal operation");
		System.out.println("p1 = "+ p1);
		System.out.println("p1.name = "+ p1.name);
		System.out.println("p1.age = "+ p1.age);
		System.out.println("p2 = "+ p2);
		System.out.println("p2.name = "+ p2.name);
		System.out.println("p2.age = "+ p2.age);
		
		System.out.println("\n\n Object p2 content goes to garbage collection");

	}

}

class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
}