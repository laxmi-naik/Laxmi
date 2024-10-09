package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.LinkedList;

import java.util.Iterator;


import com.xworkz.collection.dto.MatchBoxDto;


public class MatchBoxRunner {

	

	public static void main(String[] args) {
		
		MatchBoxDto MatchBoxDto1=new MatchBoxDto(100,"box");
		MatchBoxDto MatchBoxDto2=new MatchBoxDto(100,"KADDI");
		MatchBoxDto MatchBoxDto3=new MatchBoxDto(100,"BOX");
		
		
		Collection <MatchBoxDto> collection=new LinkedList<MatchBoxDto>();
		collection.add(MatchBoxDto1);
		collection.add(MatchBoxDto2);
		collection.add(MatchBoxDto3);
		
		
		
		System.out.println("total element:"+collection.size());
		System.out.println("isEmpty:"+collection.isEmpty());
		//collection.clear();
		//System.out.println("isEmpty:"+collection.isEmpty());
		//System.out.println("total element:"+collection.size());
		

		Iterator<MatchBoxDto> iterator =collection.iterator();
		
		while(iterator.hasNext()) {
			MatchBoxDto ref=iterator.next();
			System.out.println(ref);
			
		}
		
	}

}
