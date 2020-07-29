package com.chetan.beveragefactory;

public enum Ingredient {

	Milk(1),
	Sugar(0.5), 
	Soda(0.5),
	mint(0.5),
	water(0.5);
	
	double price ;
	
	private Ingredient(double p) {
	 this.price=p;
	}
	
	
	public static double getPrice(String ing){
		
		if("milk".equalsIgnoreCase(ing)) {
			return Milk.price;
		}else if("sugar".equalsIgnoreCase(ing)) {
			return Sugar.price;
		}else if("soda".equalsIgnoreCase(ing)) {
			return Soda.price;
		}else if("mint".equalsIgnoreCase(ing)) {
			return mint.price;
		}else if("water".equalsIgnoreCase(ing)) {
			return water.price;
		}else {
			throw new IllegalArgumentException();
		}
		
	}
	
}
