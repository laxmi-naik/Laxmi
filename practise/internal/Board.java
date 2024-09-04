package com.xworkz.practise.internal;

public class Board {
private double cost;
private String type;

protected   Board () {
	System.out.println("running const with no-arg.....");
}

public Board ( double cost,String type) {
	this.cost=cost;
	this.type=type;
}

public void display() {
	System.out.println("cost:"+this.cost);
	System.out.println("type:"+this.type);
}
}
