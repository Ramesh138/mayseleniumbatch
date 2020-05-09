package com.seleniumproject1.condition;

public class conditions {

	public void ifcase(int num) {

		int num1 = 10;

		if (num1 <= 10) {

			System.out.println(" condition is true");

		}
		
		
		if (num<35) {
			System.out.println(" fail");
		}else if (num>35&&num<60) {
			System.out.println("pass");
		}else if (num>60&&num<75) {
			System.out.println("first class");
		}else if (num>75&&num<100) {
			System.out.println("Sowbhagya is distinct pass");
		}else {
			System.out.println("you did write exams");
		}

	}

	public void switchmethod(String day) {

		switch (day) {
		case "Monday":
			System.out.println(" today is monday");
			break;

		case "Thues":
			System.out.println(" today is Thuesday");
			break;

		case "Wenes":
			System.out.println(" today is monday");
			break;

		default:

			System.out.println("  Something is wrong");
			break;
		}
	}

	public void forMethod() {

		// true friend

		String names[] = { "", "Ram", "Sam", "Raj" };

		for (int i = 1; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

	public void whilemethod() {

		// partial friend
		String names[] = { "", "Ram", "Sam", "Raj" };

		int i = 0;

		while (i < names.length) {
			System.out.println(names[i]);
			i++;
		}

	}

	public void dowhilemethod() {

		// fake friend
		String names[] = { "", "Ram", "Sam", "Raj" };

		int i = 0;

		do {
			System.out.println(names[i]);
			i++;
		} while (i < names.length);

	}

	public static void main(String[] args) {

		conditions con = new conditions();

		con.ifcase(200);

		con.switchmethod("Sat");

		con.forMethod();

		con.whilemethod();

		con.dowhilemethod();
	}
}
