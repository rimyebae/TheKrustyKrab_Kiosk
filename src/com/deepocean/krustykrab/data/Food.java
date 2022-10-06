package com.deepocean.krustykrab.data;

public class Food extends Goods{
	public String expiryDate;
	
	public Food() {
		super();
	}
	
	public Food(double price, String name) {
		super(price,name);
	}
}

