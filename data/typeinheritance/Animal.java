package com.xworks.data.typeinheritance;

public class Animal {
private String color;
private char gender;
 public Animal(String color,char gender) {
	 this.color=color;
	 this.gender=gender;
	 }
 public void display() {
	 System.out.println("Color:"+this.color);
	 System.out.println("Gender:"+this.gender);
 }
}
