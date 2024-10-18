package com.xworkz.data;

public class Halva {
public String flavor;
public double cost;
public String type;
  
public Halva() {
	System.out.println("no-arg constructer");
}
public Halva(String flavor,double cost,String type) {
	this.flavor=flavor;
	this.cost=cost;
	this.type=type;
}
public void print() {
	 System.out.println("Flavor:"+this.flavor);
	 System.out.println("Cost:"+this.cost);
	 System.out.println("Type:"+this.type);
}
}
