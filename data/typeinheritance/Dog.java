package com.xworks.data.typeinheritance;

public class Dog extends Animal {
	public Dog(String color,char gender) {
		super(color,gender);
	}
	public void print() {
		System.out.println("running print method in dog");
	}
}
