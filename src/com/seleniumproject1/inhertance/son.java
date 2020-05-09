package com.seleniumproject1.inhertance;

public class son extends Father {
	
	public void sname(int age) {
		
		String name="Ramesh";
		
		String fullname=name+" "+lname;
		
		if(age >18) {
			propertytograndson();
		}else {
			System.out.println("you are minor");
		}
	}

	public static void main(String[] args) {
		son fat= new son();
		
		fat.sname(19);
	}
}
