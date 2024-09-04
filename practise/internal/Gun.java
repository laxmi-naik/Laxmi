package com.xworkz.practise.internal;

public class Gun extends Weapon {
	@Override
public void use() {
	System.out.println("running use method in gun");
}
	@Override
public void fire() {
		System.out.println("running fire method in gun");	
}
public void show() {
	use();
	fire();
	System.out.println("running show method in gun");
}
}
