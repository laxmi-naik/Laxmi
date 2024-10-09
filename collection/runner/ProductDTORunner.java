package com.xworkz.collection.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.ProductDTO;

public class ProductDTORunner {

	public static void main(String[] args) {

		ProductDTO ProductDTO1 = new ProductDTO(101, "Soap", "Lux", 1500);
		ProductDTO ProductDTO2 = new ProductDTO(102, "Shapoo", "Pantene", 1000);
		ProductDTO ProductDTO3 = new ProductDTO(103, "Plate", "Corelle", 20000);
		ProductDTO ProductDTO4 = new ProductDTO(104, "Chair", "Featherlite", 4000);
		ProductDTO ProductDTO5 = new ProductDTO(105, "Table", "Ikea", 5650);
		ProductDTO ProductDTO6 = new ProductDTO(106, "Laptop", "Hp", 3000);
		ProductDTO ProductDTO7 = new ProductDTO(107, "Notebook", "Classmate", 35000);
		ProductDTO ProductDTO8 = new ProductDTO(108, "Pen", "Parker", 4003);
		ProductDTO ProductDTO9 = new ProductDTO(109, "Bed", "Wakefit", 4050);
		ProductDTO ProductDTO10 = new ProductDTO(110, "Watch", "Rolex", 5300);

		Collection<ProductDTO> collection = new ArrayList<ProductDTO>();

		collection.add(ProductDTO1);
		collection.add(ProductDTO2);
		collection.add(ProductDTO3);
		collection.add(ProductDTO4);
		collection.add(ProductDTO5);
		collection.add(ProductDTO6);
		collection.add(ProductDTO7);
		collection.add(ProductDTO8);
		collection.add(ProductDTO9);
		collection.add(ProductDTO10);

		collection.forEach((ref) -> System.out.println(ref));
		System.out.println("+++++++++++sort+++++++++");
		// comparator
		collection.stream().sorted().forEach(dto -> System.out.println(dto));

		System.out.println("+++++++++1++++++++++++");
		// 1. Collect product cost greater than 5000
		collection.stream().filter(dto -> dto.getCost() > 5000).forEach(dto -> System.out.println(dto));

		System.out.println("++++++++++++2++++++++++++");
		
		// 2. Collect product cost greater than 5000 & less than 30000
		collection.stream().filter(dto -> dto.getCost() > 5000 && dto.getCost() < 30000)
				.forEach(dto -> System.out.println(dto));
		
		System.out.println("+++++++++++++3++++++++++++++");
		// 3. Collect product sort in desc by cost
		collection.stream().sorted((ref1, ref2) -> Double.compare(ref2.getCost(), ref1.getCost()))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));

		System.out.println("++++++++++++++4++++++++++++++++++");
		
		// 4. Collect product where vendor names starts with A and sort by asc by name
		collection.stream().filter(product -> product.getVendor().startsWith("C"))
        .sorted()
        .collect(Collectors.toList())
        .forEach((ref)->System.out.println(ref));

		System.out.println("+++++++++++++++5+++++++++++++++");
		
		// 5. Collect product sort by cost & id
		collection.stream().sorted(Comparator.comparing(ProductDTO::getCost).thenComparing(ProductDTO::getId))
				.collect(Collectors.toList()).forEach(ref -> System.out.println(ref));

		System.out.println("++++++++++6++++++++");
		// 6. Collect only names from product

		collection.stream().map((ref) -> ref.getName()).forEach(ref -> System.out.println(ref));

		System.out.println("++++++++++++7++++++++++++");
		// 7. Collect only id from product
		collection.stream().map((ref) -> ref.getId()).forEach(ref -> System.out.println(ref));

		System.out.println("+++++++++++8+++++++++++++");
		// 8. collect product by converting name to uppercase
		collection.stream().map((ref) -> ref.getName().toUpperCase()).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));
	}

}
