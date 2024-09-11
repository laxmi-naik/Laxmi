package com.xworks.concepts;

public class Car extends Vehicle {
 public Car(String color, String type) {
		super(color, type);
		System.out.println("cons with arg....");
	}
 @Override
public void print() {
	System.out.println("running print method in car"); 
 }

}
