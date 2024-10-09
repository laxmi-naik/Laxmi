package com.xworkz.collection.dto;

import java.io.Serializable;



public class MatchBoxDto implements Serializable{
 private   double cost;
 private String brand;
 public MatchBoxDto() {
	 
 }
public MatchBoxDto(double cost, String brand) {
	super();
	this.cost = cost;
	this.brand = brand;
}
@Override
public String toString() {
	return "MatchBoxDto [cost=" + cost + ", brand=" + brand + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	long temp;
	temp = Double.doubleToLongBits(cost);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MatchBoxDto other = (MatchBoxDto) obj;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
		return false;
	return true;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
 
}
 

