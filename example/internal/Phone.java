package com.xworkz.example.internal;

public class Phone {
 private String brand="oppo";
 
  public String getbrand() {
	  System.out.println("running getbrand in phone");
	  return brand;
  }
  private void setbrand(String brand) { 
	 
	  this.brand=brand;
  }
}
