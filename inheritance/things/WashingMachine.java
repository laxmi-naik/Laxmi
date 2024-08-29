package com.xworks.inheritance.things;

public class WashingMachine {
	 private String brand;
	  private String type;
	  private int capacity;
	  public WashingMachine(String brand,String type,int capacity) {
		  this.brand=brand;
		  this.type=type;
		  this.capacity=capacity;
		  
	  }
	  public void rinse() {
		  System.out.println("running rinse in washingmachine");
	  }
	   public void show() {
		   System.out.println("Brand:"+this.brand);
		   System.out.println("Type:"+this.type);
		   System.out.println("Capacity:"+this.capacity);
	   }
}
