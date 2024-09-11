package com.xworks.concepts;

public class SuperMarket extends Market {
	@Override
	public void print() {
		System.out.println("running print method in SuperMarket");
		this.show();
	}
	@Override
	public void display() {
		System.out.println("running display method in SuperMarket");
		super.print();
	} 
	public void show() {
		System.out.println("running show method in SuperMarket");	
	}
}
