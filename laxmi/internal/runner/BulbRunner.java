package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Bulb;

public class BulbRunner {

	public static void main(String[] args) {
		Bulb Bulb1=new Bulb(2,150,"led" , "white", 20, "crompton");
		Bulb Bulb2=new Bulb(2,150, "daylight",  "red", 20, "halonix");
       boolean ref=Bulb1.equals(Bulb2);
       System.out.println("Bulb1 equals to Bulb2:"+ref);
	}

}
