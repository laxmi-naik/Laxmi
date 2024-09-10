package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Jeans;

public class JeansRunner {

	public static void main(String[] args) {
		Jeans jeans1=new Jeans("calvin klein", 28, "wide", 600, 20, "black");
		Jeans jeans2=new Jeans("levis", 28, "wide", 700, 30, "black");
		 boolean name= jeans1.equals(jeans2);
		 System.out.println("jeans1 equalsjeans2:"+name);

	}

}
