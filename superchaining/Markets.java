package com.xworks.inheritance.superchaining;

public class Markets {
	public String name;
	public String location;
	public int shops;
	public String type;
	public Markets(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	
	public Markets(String name, String location, int shops, String type) {
		super();
		this.name = name;
		this.location = location;
		this.shops = shops;
		this.type = type;
	}


	public void run() {
		System.out.println("Name:"+this.name);
		System.out.println("Location:"+this.location);
		System.out.println("Shops:"+this.shops);
		System.out.println("Type:"+this.type);
	}
	

}
