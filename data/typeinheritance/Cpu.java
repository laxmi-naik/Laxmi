package com.xworks.data.typeinheritance;

public class Cpu  extends Computer{
 public Cpu( String brand,double cost) {
	 super(brand,cost);
 }
 public void boot() {
	 
	 System.out.println("running boot method in cpu");
 }
}
