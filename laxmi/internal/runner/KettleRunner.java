package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Kettle;

public class KettleRunner {

	public static void main(String[] args) {
		Kettle kettle1=new Kettle("bule", 800, 120,"Milton", 1, 10);
		Kettle kettle2=new Kettle("pink",699, 300, "breville", 2, 20);
		boolean ref=kettle1.equals(kettle2);
		System.out.println("kettle1 equals to kettle2:"+ref);

	}

}
