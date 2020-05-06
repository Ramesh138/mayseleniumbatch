package com.seleniumproject1.accessmodifier;

import com.seleniumproject1.staticnonstatic.StaticandnonStatic;

public class PublicClass1 {
	
	
	// public can be access  through out the project 
	
	public int num =100;
	
	public void m1() {
		System.out.println(" Method 1");
	}
	
	public void m2() {
		
		 System.out.println(" Method 2");
		
	}
	
	
	
	 public static void main(String[] args) {
		Privateclass pri= new Privateclass();
		Protectedclass pro=new Protectedclass();
		StaticandnonStatic.m1();
		
		System.out.println(StaticandnonStatic.num);
		pro.m1();
		pro.m2();

	}
	 
	

}
