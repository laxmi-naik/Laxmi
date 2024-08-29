package com.xworks.inheritance.things;

public class Dress {
private String brand;
private char size;
private double price;

public Dress(String brand,char size,double price) {
	this.brand=brand;
	this.size=size;
	this.price=price;
}
public void  wear() {
	
}
public void tear() {
	System.out.println("Brand:"+ this.brand);
	System.out.println("Size:"+ this.size);
	System.out.println("Price:"+ this.price);
}


}

