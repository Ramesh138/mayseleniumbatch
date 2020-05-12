package com.seleniumproject1.wrapperMethod;

public class Father {

	
	public  void property() {
		System.out.println(" 10 Lakhs");
	}
	
	public static void main(String[] args) {
		 Father obj =(Father) new Son();
		 
		 obj.property();
		 
	}
}
