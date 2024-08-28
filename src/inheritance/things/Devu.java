package com.xworks.datatypes.things;

public class Devu {
public WaterBottle waterBottle;
 public void drown() {
	 if(waterBottle!=null) {
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.color);
		}
		else {
			System.out.println("waterBottle is null");	
		}
 }
}
