package com.xworks.laxmi.internal;

public class Jeans {
private String brand;
private int size;
private String type;
private double price;
private int discount;
private String color;
public Jeans(String brand, int size, String type, double price, int discount, String color) {
	super();
	this.brand = brand;
	this.size = size;
	this.type = type;
	this.price = price;
	this.discount = discount;
	this.color = color;
}

@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Jeans ) {
				Jeans jean=(Jeans)obj;
				if(this.size==jean.size&& this.color.equals(jean.color)&&this.type.equals(jean.type) ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no jeans ");
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
	return "Jeans [Brand name=" + brand + ", Size=" + size + ", Type=" + type + ", Price=" + price + ", Discount=" + discount
			+ ", Color=" + color + "]";
}

}
