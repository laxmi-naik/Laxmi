package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Saree;

public class SareeRunner {

	public static void main(String[] args) {
		Saree Saree1=new Saree("red", 10, "silk", 1000, "jaypore", 6);
		Saree Saree2=new Saree("black", 10, "sateen", 1000, "kanchipuram",5);
         boolean ref=Saree1.equals(Saree2);
         System.out.println("Saree1 equals to  Saree2:"+ref);
	}

}
