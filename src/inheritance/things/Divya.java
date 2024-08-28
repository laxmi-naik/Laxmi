package com.xworks.datatypes.things;

public class Divya {
	Shoe shoe =new Shoe();
	public void print() {
		shoe.safeGuard();
		shoe.enhanceWalk();
		System.out.println(shoe.brand);
		System.out.println(shoe.cost);
	}
	 
}
