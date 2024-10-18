package com.xworkz.data;

public class SandalData {
	private String brand;
	private char size;
	private double cost;
	private String color;
	
	 public SandalData(String brand,char size,double cost,String color) {
		 this.brand=brand;
		 this.size=size;
		 this.cost=cost;
		 this.color=color;
		 
	 }
	 
	 public void display() {
		 System.out.println("Brand:"+this.brand);
		 System.out.println("Size:"+this.size);
		 System.out.println("Cost:"+this.cost);
		 System.out.println("Color:"+this.color);
	 }
	
}
