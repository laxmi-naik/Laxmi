package com.xworks.data.typeinheritance;

public class Cd extends Cpu {
public Cd(String brand, double cost) {
	super(brand,cost);
	
}
public void take() {
	
	System.out.println("running take method in cd");
}
}
