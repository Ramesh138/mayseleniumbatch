package com.seleniumproject1.collection;

import java.util.HashMap;
import java.util.Set;

public class Map {

	
	 public static void main(String[] args) {
		
		 
		 HashMap map=new HashMap(); 
		 
		 map.put("Ramesh", "101");
		 map.put("Ramesh1", "102");
		 map.put("Ramesh2", "103");
		 map.put("Ramesh3", "104");
		 map.put("Ramesh4", "105");
		 
		 System.out.println(map.entrySet());
		  
		 System.out.println(map.keySet()+"/br");
		  
		 System.out.println(map.values());
		 
		 System.out.println(map.get("Ramesh1"));
		 
		 System.out.println(map.get(2));
		 
	}
}
