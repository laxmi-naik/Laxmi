package com.xworks.datatypes.things;

public class Shwetha {
public void soak(WaterBottle waterBottle) {
	if(waterBottle!=null) {
		waterBottle.fill();
		waterBottle.empty();
		waterBottle.crush();
		System.out.println(waterBottle.quantity);
	}
	else {
		System.out.println("waterBottle is null");	
	}
}
}
