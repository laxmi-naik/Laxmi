package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Gun;

public class GunRunner {

	public static void main(String[] args) {
		Gun Gun1 =new Gun("pistol", "black", 4, "chrome moly", 1200, "glock");
		Gun Gun2 =new Gun("rifle", "gunmetal", 3, "carbon", 1500, "colt");
		boolean ref=Gun1.equals(Gun2);
		System.out.println("Gun1 equals to Gun2:"+ref);
	}

}
