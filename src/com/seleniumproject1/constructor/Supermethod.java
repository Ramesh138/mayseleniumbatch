package com.seleniumproject1.constructor;

public class Supermethod  extends ConstructorClass{
	
	
	int num=100;
	

	Supermethod(){
		super("Ramesh",10,true);		
		System.out.println(super.num);
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		
		Supermethod obj= new Supermethod();
		
	}

}
