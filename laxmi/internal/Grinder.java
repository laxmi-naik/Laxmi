package com.xworks.laxmi.internal;

public class Grinder {
private String color;
private int discount;
private int warranty;
private double price;
private String brand;
private int capacity;
public Grinder(String color, int discount, int warranty, double price, String brand, int capacity) {
	super();
	this.color = color;
	this.discount = discount;
	this.warranty = warranty;
	this.price = price;
	this.brand = brand;
	this.capacity = capacity;
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof Grinder ) {
			Grinder grinder=(Grinder)obj;
			if(this.price==grinder.price&& this.capacity==grinder.capacity&&this.discount==grinder.discount ) {
				System.out.println(" condition is equals");
				return true;
			}
			else {
				System.out.println("there is no grinder ");
		}
			
	}
		else {
			System.out.println("obj is null");
		}
	
}
		return super.equals(obj);
	}
@Override
public String toString() {
	return "Grinder [Color=" + color + ", Discount=" + discount + ", Warranty=" + warranty + ", Price=" + price
			+ ", Brand=" + brand + ", Capacity=" + capacity + "]";
}

}
