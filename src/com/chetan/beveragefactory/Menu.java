package com.chetan.beveragefactory;

public enum Menu {

	Coffee(5),Chai(4),Banana_Smoothie(6),Strawberry_Shake(7),Mojito(7.5);

	double price;
	
	Menu(double m){
		this.price = m;
	}
	
	 static double getValue(String x) {
        if(x.equalsIgnoreCase("Coffee")) {
           return Coffee.price;	
        }else if(x.equalsIgnoreCase("Chai")){
            return Chai.price;	
        }else if(x.equalsIgnoreCase("Banana Smoothie")){
            return Banana_Smoothie.price;	
        }else if(x.equalsIgnoreCase("Strawberry Shake")){
            return Strawberry_Shake.price;	
        }else if(x.equalsIgnoreCase("Mojito")){
            return Mojito.price;	
        }else {
        	throw new IllegalArgumentException();
        }
        
        
     }
	
}
