package com.xworkz.example.internal;

public interface Vehicle {
  double salary();
  default String company() {
	  System.out.println("Running company method in Vehicle");
	  return null;
  }
}
