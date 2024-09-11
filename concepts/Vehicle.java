package com.xworks.concepts;

public class Vehicle {
	private double price;
	private String color;
	private String type;
	public Vehicle(double price, String color, String type) {
		super();
		this.price = price;
		this.color = color;
		this.type = type;
	}
	public Vehicle(String color, String type) {
		super();
		this.color = color;
		this.type = type;
	}
	public void print() {
		System.out.println("running the print method in vehicle");
	}
	public void display(){
		System.out.println(price);
		System.out.println(color);
		System.out.println(type);
	}

}
