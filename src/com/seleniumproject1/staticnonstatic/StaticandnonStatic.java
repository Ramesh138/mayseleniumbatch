package com.seleniumproject1.staticnonstatic;

public class StaticandnonStatic {
	
	 public static int num=10;

	public static void m1() { // addresss == 102
		System.out.println(" i am static ");
	}

	public static void m2() {  // address   ======101
		System.out.println(" i am static");
	}

	public void m3() {
		System.out.println(" i am non static");
	}
	
	
	public static void main(String[] args) {
		StaticandnonStatic sts= new  StaticandnonStatic(); // creating the address  103
		
		sts.m3();
		sts.m1();
		sts.m2();
		
		m1();
		
		m2();
		
		
	}
}
