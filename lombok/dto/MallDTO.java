package com.xworkz.lombok.dto;

import com.xworkz.lombok.content.Location;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class MallDTO {
	private int id;
	private String name;
	private  Location location;
	private String owner;
	private double landDimension;
	
	
	
	
}
	
