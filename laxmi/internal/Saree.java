package com.xworks.laxmi.internal;

public class Saree {
	private String color;
	private int discount;
	private String type;
	private double price;
	private String brand;
	private int length;
	public Saree(String color, int discount, String type, double price, String brand, int length) {
		super();
		this.color = color;
		this.discount = discount;
		this.type = type;
		this.price = price;
		this.brand = brand;
		this.length = length;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Saree ) {
				Saree saree=(Saree)obj;
				if(this.price==saree.price&& this.length==saree.length&&this.discount==saree.discount ) {
					System.out.println(" condition is equals");
					return true;
				}
				else {
					System.out.println("there is no saree ");
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
		return "Saree [color=" + color + ", discount=" + discount + ", type=" + type + ", price=" + price + ", brand="
				+ brand + ", length=" + length + "]";
	}
	
}
