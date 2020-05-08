package com.seleniumproject1.stringsconcept;

public class StringConcepts {

	public static void charatm1() {
		// char charAt(int index) returns char value for the particular index

		String name = "Sowbhagya";

		System.out.println(name.charAt(4));

	}

	public static void formatm1() {
		// static String format(String format, Object... args) returns a formatted
		// string.
		String str1 = String.format("%d", 101); // Integer value
		String str2 = String.format("%s", "Amar Singh"); // String value
		String str3 = String.format("%f", 101.00); // Float value
		String str4 = String.format("%x", 101); // Hexadecimal value
		String str5 = String.format("%c", 'c'); // Char value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);

	}

	public static void lengthm1() {
		// int length() returns string length

		String name = "Sowbhagya";

		System.out.println(name.length());

	}

	public static void substringm1() {
		// String substring(int beginIndex) returns substring for given begin index.

		String name = "Sowbhagya";

		System.out.println(name.substring(0, 2));

	}

	public static void containm1() {
		// String substring(int beginIndex) returns substring for given begin index.

		String name = "Sowbhagya";

		if (name.contains("Sow")) {
			System.out.println(" i am correct");
		}

	}

	public static void cemptym1() {
		// String substring(int beginIndex) returns substring for given begin index.

		String name = "";

		if (name.isEmpty()) {
			System.out.println(" i am correct");
		}

	}

	public static void replacem1() {
		// String substring(int beginIndex) returns substring for given begin index.

		String name = "SowBhagya123";

		String replacename = name.replace("123", "");

		System.out.println(replacename);

	}

	public void eqcase() {

		String name = "sowbhagya";

		String name1 = "SOWBHAGYA";

		if (name.equalsIgnoreCase(name1)) {

			System.out.println(" i am true");
		}

	}

	public void splitmethod() {

		String name = " Ramesh ponneri";

		String svalue[] = name.split(" ");
		System.out.println(svalue[0]);

		System.out.println(svalue[1]);

	}

	public void indexmethod() {

		String name = "Ramesh ";

		int position = name.indexOf("m");

	}

	public static void lcase() {
		String name = "Ramesh ";

		System.out.println(name.toLowerCase());
	}

	public static void Ucase() {
		String name = "Ramesh ";

		System.out.println(name.toUpperCase());
	}

	public void trimm1() {

		String name = "                Ra          mesh               ";

		System.out.println(name.trim());
	}

	public void valueofm1() {

		String name = "Ramesh ";

		System.out.println(name.valueOf("m"));

	}

	public static void main(String[] args) {
		charatm1();
	}
	
	public void startm1() {
		
		String name = "Ramesh ";

		if(name.startsWith("R")) {
			 System.out.println(" I am true");
		}
		
	}

}
