package com.seleniumprojects.nonprimitive;

public class Arrays {
	
	// Array is a collection 
	
	public static void main(String[] args) {
		 String names[]= {"Ramesh","Mahesh","Suresh"}; //single index array with fixed values
		 
		 System.out.println(names.length);
		 
		 String names1[]= new String[5]; // how to declare length
		 
		 System.out.println(names1.length);
		 
		 String names2[][]= {{"Ramesh","Mahesh","Suresh"},{"raj","Sajan","Suresh"}};
		 
		System.out.println(names2[0][1]);
		System.out.println(names2[0][2]);
		System.out.println(names2[0][0]);
		System.out.println(names2[1][0]);
		System.out.println(names2[1][1]); 	 
	}
	 
	 

}
