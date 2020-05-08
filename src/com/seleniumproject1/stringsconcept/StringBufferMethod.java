package com.seleniumproject1.stringsconcept;

public class StringBufferMethod {
	
public static void main(String[] args) {
	//Stringbuffer is mutable
	
	String  lname="Ponneri";
	
	StringBuffer sb= new StringBuffer("Ramesh");
	
	StringBuffer name =sb.delete(1, 2);
	
	System.out.println(name);
}

}
