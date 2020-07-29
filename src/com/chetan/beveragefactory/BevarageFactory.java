package com.chetan.beveragefactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BevarageFactory {
	
	  
	  public static Map<String,List<String>> getMenu(){
		  
		    List<String> coffee = new LinkedList<String>();
			coffee = Arrays.asList("coffee","milk","sugar","water");
			List<String> chai = new LinkedList<String>();
			chai = Arrays.asList("tea","milk", "sugar", "water");
			List<String> Banana_Smoothie = new LinkedList<String>();
			Banana_Smoothie = Arrays.asList("banana", "milk", "sugar", "water");
			List<String> Strawberry_Shake = new LinkedList<String>();
			Strawberry_Shake = Arrays.asList("strawberries", "sugar", "milk", "water");
			List<String> Mojito = new LinkedList<String>();
			Mojito = Arrays.asList("lemon","sugar","water","soda","mint");
			
			Map<String,List<String>> m1= new HashMap<String, List<String>>();
			
			
			m1.put("coffee", coffee);
			m1.put("chai", chai);
			m1.put("banana smoothie", Banana_Smoothie);
			m1.put("strawberry shake", Strawberry_Shake);
			m1.put("mojito", Mojito);
		
		  return m1;
	  }
	

}
