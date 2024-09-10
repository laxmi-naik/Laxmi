package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		Helmet helmet1=new Helmet(600, "black", "vega",1200, 1, 's');
		Helmet helmet2=new Helmet(600, "red", "arai", 1200, 1, 'm');
        boolean ref=helmet1.equals(helmet2);
        System.out.println("helmet1 is equals to helmet2:"+ref);
	}

}
