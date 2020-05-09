package com.seleniumproject1.constructor;

public class ConnstructorthisSuper {
	
	String name="Ramesh ";
	
	int sal=10000;
	
	public void m2() {
		System.out.println();
	}
	
	public void m3() {
		System.out.println();
	}
	
	public void m1(int sal) {
		this.sal=sal;
	
		System.out.println(this.sal);
		
	}
	
	 public static void main(String[] args) {
		
		 ConnstructorthisSuper cons= new ConnstructorthisSuper();
		 
		 cons.m1(200);
	}

}
