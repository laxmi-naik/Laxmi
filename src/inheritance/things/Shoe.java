package com.xworks.datatypes.things;

public class Shoe {
	 public String brand="nike";
	  public double cost=1000;
	 public  Shoe(){
		 System.out.println("created shoe using no-arg const....");
	  }
	 public void  safeGuard() {
		 System.out.println("running safeguard in shoe");
		
	 }
	 public void enhanceWalk() {
		 System.out.println("running enhancewalk in shoe"); 
	 }
}
