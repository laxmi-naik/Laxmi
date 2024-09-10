package com.xworks.laxmi.internal;

public class Bulb {
private int warranty;
private int price;
private String type;
private String color;
private int watts;
private String brand;
public Bulb(int warranty, int price, String type, String color, int watts, String brand) {
	super();
	this.warranty = warranty;
	this.price = price;
	this.type = type;
	this.color = color;
	this.watts = watts;
	this.brand = brand;
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof Bulb ) {
			Bulb bulb=(Bulb)obj;
			if(this.price==bulb.price&& this.watts==bulb.watts&&this.warranty==bulb.warranty ) {
				System.out.println(" condition is equals");
				return true;
			}
			else {
				System.out.println("there is no bulb ");
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
	return "Bulb [warranty=" + warranty + ", price=" + price + ", type=" + type + ", color=" + color + ", watts="
			+ watts + ", berand=" + brand + "]";
}

}
