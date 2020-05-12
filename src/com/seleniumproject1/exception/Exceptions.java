package com.seleniumproject1.exception;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException  {

		int a = 10;

		int b = 0;

		int d = 0;
		
		String value=null;

		
		
		try {
			int c=a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Error("Division login Exception");
		}
		
		Thread.sleep(1000);
		
		
		System.out.println("dsvsdv");
	}

}
