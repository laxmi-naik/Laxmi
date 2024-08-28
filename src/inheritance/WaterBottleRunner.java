package com.xworks.datatypes;

import com.xworks.datatypes.things.Devu;
import com.xworks.datatypes.things.Gunashree;
import com.xworks.datatypes.things.WaterBottle;
import com.xworks.datatypes.things.Shwetha;


public class WaterBottleRunner {

	public static void main(String[] args) {
		Gunashree gunashree=new Gunashree();
		gunashree.load();
		
		Shwetha shwetha =new Shwetha();
		WaterBottle waterBottle=new WaterBottle();
		shwetha.soak(waterBottle);
		
		Devu devu = new Devu();
		devu.waterBottle=new WaterBottle();
		devu.drown();
	}

}
