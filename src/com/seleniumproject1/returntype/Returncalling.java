package com.seleniumproject1.returntype;

public class Returncalling {

	public void m1() { // NO return type

		System.out.println("  L1");

		System.out.println(" L2");

		System.out.println(" l3");

		System.out.println(" l3");

	}

	public boolean m2() {

		boolean flag = false;

		if ("Ramesh".equals("Ramesh")) {
			return true;
		}

		int a = 10;

		int b = 20;

		int c = a + b;

		return flag;
	}

	public static void main(String[] args) {

		Returncalling ret = new Returncalling();

		ret.m1();

		// int result =ret.m2(); // result of this method we will use as resultant
		// valueret

		if (ret.m2() == true) {
			System.out.println("Ramesh");
		}

	}

}
