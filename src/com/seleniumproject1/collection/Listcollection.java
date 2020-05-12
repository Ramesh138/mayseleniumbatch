package com.seleniumproject1.collection;

import java.util.ArrayList;
import java.util.List;

public class Listcollection {
	
	// String names[]= { assvas=asv=asv=as=v=as=v==sav=as=v=as};
	
	public static void main(String[] args) {
		List<String> li= new ArrayList<String>();
		
		li.add("Ramesh");
		
		li.add("Mahesh");
		
		li.add("Rajesh");
		
		
		
li.add("Ramesh1");
		
		li.add("Mahesh");
		
		li.add("Rajesh");
		
li.add("Ramesh");
		
		li.add("Mahesh");
		
		li.add("Rajesh");
		
		System.out.println(li);
		
		li.remove("Ramesh");
		
		System.out.println(li);
		
		
		
		li.addAll(li);
		
		System.out.println(li);
		
		
		
		int size=li.size();
		
		for (int i = 0; i < size; i++) {
			
			if(li.get(i).contains("Ra")) {
				System.out.println(li.get(i));
			}
		}
	}
	
	
	

}
