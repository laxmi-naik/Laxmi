package com.xworkz.data;

public class Chicken {
public String color;
public String type;
public double cost;
public char size;
public float height;
public float weight;
public char gender;
public String eggSize;
public String eggColor;
public double eggCost;

public Chicken() {
	  System.out.println("no-arg constructer");
}

 public Chicken(String color,String type,double cost,char size,float height,float weight,char gender,String eggSize,String eggColor,double eggCost) {
	 this.color=color;
	 this.type=type;
	 this.cost=cost;
	 this.size=size;
	 this.height=height;
	 this.weight=weight;
	 this.gender=gender;
	 this.eggSize=eggSize;
	 this.eggColor=eggColor;
	 this.eggCost=eggCost;
 }
 public void print() {
	 System.out.println("Color:"+this.color);
	 System.out.println("Type:"+this.type);
	 System.out.println("Cost:"+this.cost);
	 System.out.println("Size:"+ this.size);
	 System.out.println("Height:"+this.height);
	 System.out.println("Weight:"+this.weight);
	 System.out.println("Gender:"+this.gender);
	 System.out.println("EggSize:"+this.eggSize);
	 System.out.println("EggColor:"+ this.eggColor);
	 System.out.println("EggCost:"+this.eggCost);
 }
}
