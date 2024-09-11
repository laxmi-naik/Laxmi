package com.xworks.concepts;

public class Dress {
	private String color;
{
	color="black";
	System.out.println("running object block in dress");
}
public static void main(String[] args) {
	Dress dress=new Dress();
	String ref=dress.color;
	System.out.println(ref);
	System.out.println("running main method in dress");
}
}
