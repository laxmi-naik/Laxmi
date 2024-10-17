package com.xworkz.lombok.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import com.xworkz.lombok.content.Location;
import com.xworkz.lombok.dto.MallDTO;

public class MallRunner {

	public static void main(String[] args) {
		Collection<MallDTO> collection = new ArrayList<MallDTO>();
		MallDTO mallDTO1=new MallDTO(101,"garuda mall",Location.ASHOKNAGAR,"karan",900.456);
		MallDTO mallDTO2=new MallDTO(105,"ub city",Location.SHANTHALANAGAR,"laxmi",4562.25); 
		MallDTO mallDTO3=new MallDTO(111,"mantri square mall",Location.ASHOKNAGAR,"aly",12456.45);
		MallDTO mallDTO4=new MallDTO(121,"gopalan signature mall",Location.BANNERGHATTAROAD,"bhavya",3564.89);
		MallDTO mallDTO5=new MallDTO(102,"phoenix market city",Location.MAHADEVAPURA,"anu",12458.25);
		MallDTO mallDTO6=new MallDTO(131,"orion mall",Location.RAJAJINAGAR,"samarth", 2584.32);
		MallDTO mallDTO7=new MallDTO(107,"sampige road mall",Location.MALLESWARAM,"swati",24562.00);
		MallDTO mallDTO8=new MallDTO(108,"vikramnagar plaza",Location.VIKRAMNAGAR,"lalita",324623.14);
		MallDTO mallDTO9=new MallDTO(130,"forum mall",Location.KORAMANGALA,"chanagond",65985.21);
		MallDTO mallDTO10=new MallDTO(103,"elements mall",Location.THANISANDRA,"arjun",7895.25);
		collection.add(mallDTO1);
		collection.add(mallDTO2);
		collection.add(mallDTO3);
		collection.add(mallDTO4);
		collection.add(mallDTO5);
		collection.add(mallDTO6);
		collection.add(mallDTO7);
		collection.add(mallDTO8);
		collection.add(mallDTO9);
		collection.add(mallDTO10);
		// Sort all mall by ID desc
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getId(), ref1.getId()))
		.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println("+++++++++++++++++++");
		// Sort all mall name desc order
		collection.stream().sorted((ref1, ref2) -> ref2.getName().compareTo( ref1.getName()))
		.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		System.out.println("++++++++++++++++++++++");
		// Filter all mall by landDimension less than one lakh
		collection.stream().filter(dto -> dto.getLandDimension() < 100000).forEach(dto -> System.out.println(dto));
		System.out.println("+++++++++++++++++");
         //Collect only names of mall
		collection.stream().map((ref) -> ref.getName()).forEach(ref -> System.out.println(ref));
		System.out.println("++++++++++++++++++");
		//Collect only landDimension and sort it asc order
		collection.stream().map((ref) -> ref.getLandDimension()).sorted((ref1, ref2) -> Double.compare(ref1, ref2))
		.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));
		
		  Iterator<MallDTO> iterator = collection.iterator();
	        
	        System.out.println("Using Iterator:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        ListIterator<MallDTO> listIterator = ((List<MallDTO>) collection).listIterator();

	        System.out.println("Using ListIterator:");
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        
	}

	}
}
