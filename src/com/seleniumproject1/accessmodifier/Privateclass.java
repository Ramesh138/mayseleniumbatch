package com.seleniumproject1.accessmodifier;

public class Privateclass {
	
	// Class should be always public or default 
	
	 // Private Access will be only in the current class
	
	// If  we want access the private   variables and methods  then only by using public method  ..... we can able to access
	
	private String name="Ramesh";
	
	
	private void name() {
		System.out.println("Method m1");
		
		System.out.println(" my name is"+name);
		
	}
	
	
	private  void addres() {
		System.out.println(" Method m2");
	}
	
	private void telphone() {
		
		System.out.println(" Method m3");
		
	}
	
	 public void Bankmanger() {
		 Privateclass pri= new Privateclass();  // Local   Object 
		 pri.name();
		 pri.addres();
		 pri.telphone();
	 }
	
	
	public static void main(String[] args) {
		
		 Privateclass pri= new Privateclass();  // Local   Object 
		 
		 pri.Bankmanger();
		
	}
}
