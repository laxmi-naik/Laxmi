package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		Grinder Grinder1 =new Grinder("grey",10,2,1000, "bosch", 3);
		Grinder Grinder2 =new Grinder("blue",10,2,1000, "bajaj mixer", 3);
	  boolean ref=Grinder1.equals(Grinder2);
	  System.out.println("Grinder1 equals Grinder2:"+ref);

	}

}
