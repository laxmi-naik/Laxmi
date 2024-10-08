package com.xworkz.sorted.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StateNames {

	public static void main(String[] args) {
		
		Collection<String> states = new ArrayList<String>();
        states.add("Andhra Pradesh");
        states.add("Arunachal Pradesh");
        states.add("Assam");
        states.add("Bihar");
        states.add("Chhattisgarh");
        states.add("Goa");
        states.add("Gujarat");
        states.add("Haryana");
        states.add("Himachal Pradesh");
        states.add("Jharkhand");
        states.add("Karnataka");
        states.add("Kerala");
        states.add("Madhya Pradesh");
        states.add("Maharashtra");
        states.add("Manipur");
        states.add("Meghalaya");
        states.add("Mizoram");
        states.add("Nagaland");
        states.add("Odisha");
        states.add("Punjab");
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Tamil Nadu");
        states.add("Telangana");
        states.add("Tripura");
        states.add("Uttar Pradesh");
        states.add("Uttarakhand");
        states.add("West Bengal");
        
        System.out.println("Sort in ascending order");

        states.stream().sorted().collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		System.out.println("+++++++++++++++++++");
		System.out.println("Sort in descending order");
		
		states.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));


	}

}
