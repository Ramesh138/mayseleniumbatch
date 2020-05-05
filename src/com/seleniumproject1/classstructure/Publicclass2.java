package com.seleniumproject1.classstructure;

import com.seleniumproject1.accessmodifier.Privateclass;
import com.seleniumproject1.accessmodifier.PublicClass1;

public class Publicclass2 {

	 void m3() {
		System.out.println(" method 3"); 
	 }
	 
	 void m4() {
		 System.out.println("Method 4"); 
	 }
	 
	 public static void main(String[] args) {
		
		 Publicclass2 pub2= new Publicclass2();
		 PublicClass1 pub1= new PublicClass1();
		 
		 Privateclass pri= new Privateclass();
		 
		 pri.Bankmanger();
		 
		 System.out.println(pub1.num);
	
		 pub1.m1();
		 pub1.m2();
		 pub2.m3();
		 pub2.m4();
	}
}
