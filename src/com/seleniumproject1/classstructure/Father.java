package com.seleniumproject1.classstructure;

import com.seleniumproject1.accessmodifier.Protectedclass;

class Father {
	
	//Class is a keyword  and it is predefined 
	
	//By default class is a public with in the current class and with in package 
	
	//class is blue print  and collections of functions , methods and variables 
	
	void son1() {  //  it is no return type and have  default access Specifier 
		System.out.println(" Method 1");
	}
	
	void son2() {
		System.out.println(" Method 2");
	}
	
	public static void main(String[] args) {
	//Father obj= new Father();  //	 new Classstructure() is the Object and obj is the reference and also instance 
		
	Protectedclass pro=new Protectedclass();
	

	
	StepFather obj1= new StepFather();
	
	Father obj;    /// Declaration of Object
	
	obj=new Father(); // intialization  of Object 
	
	obj.son1();  // obj is the memory Address
	obj.son2();  // obj is the memory Address
	
	obj1.Sfather();
	
	}

}

class StepFather{
	
	//  this  is sub class
	void Sfather() {
		
		System.out.println(" Method 3");
		
	}
	public static void main(String[] args) {
		StepFather obj1= new StepFather();
		
		obj1.Sfather();
		
		
	}
}