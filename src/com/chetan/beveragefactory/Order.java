package com.chetan.beveragefactory;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Order {
	
	  public static double generateBill(String [] orders) {
		  
		  double sum = 0.0;
		  
			
			for (int i = 0; i < orders.length; i++) {
				String[] temp = orders[i].split(",");
				sum = sum + Menu.getValue(temp[0]);
				for (int j = 1; j < temp.length; j++) {
					temp[j] = temp[j].replace('-', ' ').trim();
					sum = sum - Ingredient.getPrice(temp[j]);
				} 
			}		  
		  
		  return sum;
	  }
	  
	public static String[] validateOrder(String[] O) {
		
		
		Map<String,List<String>> menu = BevarageFactory.getMenu();
	
		for (int i = 0; i < O.length; i++) {

			String[] temp = O[i].split(",");
			if(!(menu.containsKey(temp[0].toLowerCase()))){ System.out.println("please enter valid order");  };
			List<String> item =  menu.get(temp[0].toLowerCase());
			
			for (int j = 1; j < temp.length; j++) {
			    temp[j] = temp[j].replace('-', ' ').trim();
				if (temp[0].equalsIgnoreCase(temp[j])) {
					System.out.println("Invalid Order");
					return null;
				}else if(item.contains(temp[j])) {
					
				}else {
					return null;
				}
			}
		}
		return O;
	}
  
	  public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
	    System.out.print("Number of item you want order : ");
		    int length = num.nextInt(), pos = -1;
		    String order[] = new String[length];
		    while(++pos < length){
		      System.out.print("Enter your order : ");
		      order[pos] = sc.nextLine();
		    }

      		
		
		if(order.length>0)
		if(validateOrder(order) != null) {System.out.println("You have to pay: "+generateBill(order)+"$");}
		else { throw new IllegalArgumentException(); }
		else { System.out.println("Please enter some order"); }
		
	}

}
