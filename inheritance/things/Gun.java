package com.xworks.inheritance.things;

public class Gun {
	
	private String  name;
	private String countryMade;
	private String type;
	public Gun(String  name,String countryMade,String type) {
		this.name=name;
		this.countryMade=countryMade;
		this.type=type;
	}
	 public void fire() {
		 System.out.println("running fire in gun"); 
	 }
	 public void display() {
		 System.out.println("Name:"+this.name);
		 System.out.println("CountryMade:"+this.countryMade);
		 System.out.println("Type:"+this.type);
	 }
}
