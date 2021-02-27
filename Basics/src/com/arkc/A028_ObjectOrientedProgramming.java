package com.arkc;

public class A028_ObjectOrientedProgramming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCircle c1 = new SimpleCircle();
		SimpleCircle c2 = new SimpleCircle(10);

		System.out.println("For c1");
		System.out.println("c1.radius = "+c1.radius);
		System.out.println("c1.getArea() = "+c1.getArea());
		
		System.out.println("For c2");
		System.out.println("c2.radius = "+c2.radius);
		System.out.println("c2.getArea() = "+c2.getArea());
		

	}
}


class SimpleCircle{

	double radius;
	String s;

	
	  public SimpleCircle(double radius) { super(); this.radius = radius; }
	  
	  
	  
	  public SimpleCircle() {
	  
	  this.radius = 1; }
	  
	  
	  
	  public double getRadius() { return radius; }
	  
	  public void setRadius(double radius) { this.radius = radius; }
	  
	  double getArea() { return 3.14 * radius * radius; }
	 

	




}
