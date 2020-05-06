package com.seleniumproject1.operator;

public class Operator {

	public void arthematic() {

		int a = 35;

		int b = 6;

		int c = a % b;

		System.out.println(c);

		String name = "Sowbhagya";

		int eid = 138;

		int sal = 40000;

		int increment = 10000;

		System.out.println(" my name is " + sal + increment);

	}

	public void increment() {
		int a = 20;
	
		System.out.println(++a);
		
		System.out.println(a);
		
	
	}
	
	
	public void decrement() {
		int a = 20;
		System.out.println(--a);
		
	}
	
	public void assignment() {
		
		int a =10;
		
		int b=30;
		
		boolean c= a==b;
		System.out.println(c);
		
		boolean d= a!=b;
		
		System.out.println(a=~b);
		
		System.out.println(a>>b);  
		
		System.out.println(a<<b);
		

	}


	public static void main(String[] args) {
		Operator ope = new Operator();
		ope.arthematic();
		ope.decrement();
		
		ope.assignment();
	}
	
	
	
	
	
}
