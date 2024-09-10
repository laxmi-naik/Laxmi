package com.xworks.laxmi.internal;

public class Gun {
private String type;
private  String color;
private int weight;
private String material;
private double price;
private String company;
public Gun(String type, String color, int weight, String material, double price, String company) {
	super();
	this.type = type;
	this.color = color;
	this.weight = weight;
	this.material = material;
	this.price = price;
	this.company = company;
}
@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof Gun ) {
			Gun gun=(Gun)obj;
			if(this.price==gun.price&& this.weight==gun.weight&&this.company.equals(gun.company) ) {
				System.out.println(" condition is equals");
				return true;
			}
			else {
				System.out.println("there is no Gun ");
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
	return "Gun [type=" + type + ", color=" + color + ", weight=" + weight + ", material=" + material + ", price="
			+ price + ", company=" + company + "]";
}

}
