package com.xworks.data.typeinheritance;

public class Vehicle {
private String company;
private double cost;
 public Vehicle(String company,double cost) {
	 this.company=company;
	 this.cost=cost;
 }
 public void display() {
	 System.out.println("Company:"+this.company);
	 System.out.println("Cost:"+this.cost);
 }
}
