package com.xworkz.sorted.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Population {

	public static void main(String[] args) {
		Collection<Long> collection=new ArrayList<Long>();
		collection.add(1450940000L);
		collection.add(1419320000L);
		collection.add(345427000L);
		collection.add(283488000L);
		collection.add(251269000L);
		collection.add(232679000L);
		collection.add( 211999000L);
		collection.add(173562000L);
		collection.add(144820000L);
		collection.add(126014000L);
		
		
		System.out.println("Sort in ascending order");

		collection.stream().sorted().collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		System.out.println("Sort in descending order");
		
		collection.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList())
		.forEach(ref->System.out.println(ref));
		
		

	}

}
