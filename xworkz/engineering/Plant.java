package com.xworkz.engineering;

public class Plant {
     String name;
     String type;
     int length;
     double height;
     double width;
     String typeOfSoil;
     String species;
     double waterRequirment;
     int age;
     String color;
      public Plant(String name,String type,int length,double height, double width) {
    	  this.name=name;
    	  this.type=type;
    	  this.length=length;
    	  this.height=height;
    	  this.width=width;
      }
      public void typeOfSoil(String typeOfSoil) 
	    { 
	    	this. typeOfSoil =  typeOfSoil;
	    }
      public void setspecies(String species) {
    	  this.species=species;
      }
      public void setwaterRequirment(double waterRequirment) {
    	  this.waterRequirment=waterRequirment;
      }
      public void setage(int age) {
    	  this.age=age;
      }
      public void setcolor(String color) {
    	  this.color=color;
      }
      public void print() {
    	  System.out.println(name);
    	  System.out.println(type);
    	  System.out.println(length);
    	  System.out.println(height);
    	  System.out.println(width);
    	  System.out.println(typeOfSoil);
    	  System.out.println(species);
    	  System.out.println(waterRequirment);
    	  System.out.println(age);
    	  System.out.println(color);
      }
}
