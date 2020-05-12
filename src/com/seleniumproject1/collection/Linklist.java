package com.seleniumproject1.collection;

import java.util.LinkedList;

public class Linklist {
	public static void main(String[] args) {
		LinkedList<String> link= new LinkedList<String>();
		
		link.add("Ramesh");
		
		link.add("Mahesh");
		
		link.add("Rajesh");
		
		link.addFirst("Ponneri");
		
		System.out.println(link);
	}

}
