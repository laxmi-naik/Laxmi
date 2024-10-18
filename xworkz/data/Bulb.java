package com.xworkz.data;

public class Bulb {
public double cost;
	 public Bulb() {
		 System.out.println("print the method with no arg...");
	 }
	 public Bulb(double cost) {
		 this.cost=cost;
	 }
	 public void print() {
		 System.out.println("Cost:"+this.cost);
	 }
}
