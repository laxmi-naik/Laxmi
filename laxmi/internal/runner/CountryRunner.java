package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.Country;

public class CountryRunner {

	public static void main(String[] args) {
		Country country1 =new Country("india", "delhi", 10, "karnataka", 91, 1254175);
		Country country2 =new Country("india", "delhi", 10, "karnataka", 91, 1254175);
        boolean ref= country1.equals(country2);
        System.out.println("country1 equals to country2:"+ref);

	}

}
