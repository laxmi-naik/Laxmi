package com.xworkz.data;

public class Bull {
public String color;
public double cost;
public int age;
public float height;
public String horned;
 
  public Bull() {
	  System.out.println("no-arg constructer");
  }
  
  public Bull(String color,double cost,int age,float height,String horned) {
	  this.color=color;
	  this.cost=cost;
	  this.age=age;
	  this.height=height;
	  this.horned=horned;
  }
  public void print() {
	  System.out.println("Color:"+this.color);
	  System.out.println("Cost:"+this.cost);
	  System.out.println("Age:"+this.age);
	  System.out.println("Height:"+this.height);
	  System.out.println("Horned:"+this.horned);
  }
}
