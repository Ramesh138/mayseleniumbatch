package com.seleniumproject1.Encapsulation;

import com.seleniumproject1.inhertance.son;

public class Son extends Father {

	public void B1(String value) {
		System.out.println(" Helping the poor children");
	}

	public static void main(String[] args) {
		Son son = new Son();

		son.B1("Helping");
		
	}

}
