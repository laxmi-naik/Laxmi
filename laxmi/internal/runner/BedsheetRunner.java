package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Bedsheet;

public class BedsheetRunner {

	public static void main(String[] args) {
		Bedsheet Bedsheet1 =new Bedsheet("blue",10, "silk", 500, "portico", 81);
		Bedsheet Bedsheet2 =new Bedsheet("red",20, "linen", 500, "urban space", 96);
        boolean ref =Bedsheet1.equals(Bedsheet2);
        System.out.println("Bedsheet1 equals to Bedsheet2:"+ref);
	}

}
