package com.seleniumproject1.constructor;

public class ConstructorClass {

	public int num=500;
	
	public void m1(String value) {

	}

	public void m1(int value) {

	}

	public void m1(boolean value) {

	}

	ConstructorClass() {
		System.out.println(" default constructor");
	}

	ConstructorClass(String value) {
		System.out.println(" single argumented Constructor");
	}

	ConstructorClass(int name) {
		System.out.println(" single argumented Constructor");
	}

	ConstructorClass(boolean value) {
		System.out.println("");
	}

	ConstructorClass(String value, String value1) {
		System.out.println(" single argumented Constructor");
	}

	ConstructorClass(String value, int value1,boolean value12) {
		System.out.println(" single argumented Constructor"+value +value1);
	}
	
	
	public static void main(String[] args) {
		ConstructorClass con= new ConstructorClass();
		
		con=new ConstructorClass(28);
		
		con= new ConstructorClass("RAMESH");
		
		con.m1(true);
	}

}
