package com.seleniumproject1.stringsconcept;

public class StringBuilderMethod2 {
	
public static void main(String[] args) {
	//Stringbuffer is mutable
	
	//string builder is not synchronized
	
	//String builder is faster than  string Buffer
	
	String  lname="Ponneri";
	
	StringBuilder sb= new StringBuilder("Ramesh");
	
	StringBuilder name =sb.delete(1, 2);
	
	System.out.println(name);
}

}
