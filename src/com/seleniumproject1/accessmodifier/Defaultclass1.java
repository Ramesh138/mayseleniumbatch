package com.seleniumproject1.accessmodifier;

 class Defaultclass1 {

	 
	  
	 void m3() {
		 
		 System.out.println(" Method 3");
	 }
	 
	 public static void main(String[] args) {
		 Defaultclass1 def1= new Defaultclass1(); // 
		 
		 DefaultClasss def= new DefaultClasss();
		 // Because DefaultClasss is there with in the Package  so that only i able create the object in this class
		 
		 System.out.println(def.num);
		 
		 System.out.println(def.name);
		 
		 def1.m3();
		 
		 def.m1();
		 
		 def.m2();
		
	}
}
