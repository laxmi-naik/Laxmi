package com.xworkz.dto.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;


import com.xworkz.dto.dto.HRDTO;



public class HRRunner {

	public static void main(String[] args) {
		HRDTO dto1=new HRDTO("laxmi","BE",2.5,"Chennai");
		HRDTO dto2=new HRDTO("bhavya","M.com",1,"bengaluru");
		HRDTO dto3=new HRDTO("swati","MBA",4.5,"Ahmedabad");
		HRDTO dto4=new HRDTO("anu","MCA",5,"Gurugram");
		HRDTO dto5=new HRDTO("samarth","B.com",8,"Hyderabad");
		HRDTO dto6=new HRDTO("lalitha","BBA",1.5,"Kolkata");
		HRDTO dto7=new HRDTO("chanagond","B.tech",3,"Mumbai");
		HRDTO dto8=new HRDTO("arjun","BE",2,"Pune");
		HRDTO dto9=new HRDTO("karan","MBA",4,"Kochi");
		HRDTO dto10=new HRDTO("kiran","MCA",6,"Goa");
		
		Collection<HRDTO> collection=new LinkedList<HRDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		
		//1. find all hr from a location
		collection.stream().filter(ref->ref.getLocation().startsWith("K")).forEach(ref->System.out.println(ref.getName()));
		System.out.println("+++++++++++++++++++++++++++");
				//2. find all hr totalExp greater than 5
				collection.stream().filter(ref->ref.getTotalExp()>5).forEach(ref->System.out.println(ref));
				System.out.println("+++++++++++++++++++++++++++");
				//3. find all hr name ending with r case in-sensitive
				collection.stream().filter(ref->ref.getName().endsWith("i")).forEach(ref-> System.out.println(ref));
				System.out.println("++++++++++++++++++++");
				//4. get only locations
				collection.stream().map(ref->ref.getLocation()).forEach(ref-> System.out.println(ref));
				System.out.println("+++++++++++++++++++++++++");
				//5. get only name
				collection.stream().map(ref->ref.getName()).forEach(ref->System.out.println(ref));
				System.out.println("+++++++++++++++++++++++");
				//6. sort hr by name and qualification
				collection.stream().sorted(Comparator.comparing(HRDTO::getName)
		        .thenComparing(HRDTO::getQualification)).collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
				System.out.println("+++++++++++++++++++");
				//7. sort hr totalExp in desc
				collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getTotalExp(), ref1.getTotalExp()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
				System.out.println("+++++++++++7++++++++++");
				//8. Iterator to remove if hr name starts with A
				 Iterator<HRDTO> iterator =collection.iterator();
					
					while(iterator.hasNext()) {
						HRDTO ref=iterator.next();
			
			            if (ref.getName().toLowerCase().startsWith("a")) {
			                iterator.remove();
			            	//System.out.println(ref);
			            }       
			}  
					  System.out.println("Remaining HRDTOs:");
				        for (HRDTO ref : collection) {
				            System.out.println(ref);
				        }
			
					System.out.println("++++++++++++++++++");
					//9. ListIterator to traverse in backward direction
					ListIterator<HRDTO> listIterator =  ((List<HRDTO>) collection).listIterator(8);

					
					 while (listIterator.hasPrevious()) {
				            HRDTO dto = listIterator.previous();
				            System.out.println(dto);
				        }

	}
}
