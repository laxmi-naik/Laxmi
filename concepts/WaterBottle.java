package com.xworks.concepts;

public class WaterBottle {
	private static double price;
	
static {
	price=10000;
	System.out.println("running static in water bottle class");
	
}
public static void main(String[] args) {
	WaterBottle waterBottle=new WaterBottle();
	
	 double ref=waterBottle.price;
	 System.out.println(ref);
	System.out.println("running main mrthod in WaterBottle ");
}
}
