package com.xworks.laxmi.internal;

public class Kettle {
private String color;
private double price;
private int size;
private String name;
private int warranty;
private int discount;
public Kettle(String color, double price, int size, String name,int warranty, int discount) {
	super();
	this.color = color;
	this.price = price;
	this.size = size;
	this.name = name;
	this.warranty = warranty;
	this.discount = discount;
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof Kettle ) {
			Kettle kettle=(Kettle)obj;
			if(this.size==kettle.size&& this.color.equals(kettle.color)&&this.discount==kettle.discount ) {
				System.out.println(" condition is equals");
				return true;
			}
			else {
				System.out.println("there is no Kettle ");
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
	return "Kettle [Color=" + color + ", Price=" + price + ", Size=" + size + ", Name=" + name + ", Warranty="
			+ warranty + ", Discount=" + discount + "]";
}

}
