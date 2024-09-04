package com.xworks.data.typeinheritance;

public class Computer {
 private String brand;
 private double cost;
 public Computer(String brand,double cost) {
	 this.brand=brand;
	 this.cost=cost;
 }
 public void show() {
	 System.out.println("Brand:"+this.brand);
	 System.out.println("Cost:"+this.cost);
 }
}
