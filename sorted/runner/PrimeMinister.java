package com.xworkz.sorted.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class PrimeMinister {

	public static void main(String[] args) {
		
			Collection<String> collection=new ArrayList<String>();
			collection.add("Jawaharlal Nehru");
			collection.add("Lal Bahadur Shastri");
			collection.add("Indira Gandhi");
			collection.add("Morarji Desai");
			collection.add("Charan Singh");
			collection.add("Rajiv Gandhi");
			collection.add("Vishwanath Pratap Singh");
			collection.add("Chandra Shekhar");
			collection.add("P.V. Narasimha Rao");
			collection.add("Atal Bihari Vajpayee");
			collection.add("H.D. Deve Gowda");
			collection.add("I.K. Gujral");
			collection.add("Manmohan Singh");
			collection.add("Narendra Modi");
			System.out.println("Sort in ascending order");

			collection.stream().sorted().collect(Collectors.toList())
			.forEach(ref->System.out.println(ref));
			
			System.out.println("+++++++++++++++++++");
			System.out.println("Sort in descending order");
			
			collection.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList())
			.forEach(ref->System.out.println(ref));

	}

}
