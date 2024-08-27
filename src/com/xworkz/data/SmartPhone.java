package com.xworkz.data;

public class SmartPhone {
  public String network;
  public int storage;
  public String name;
  public double cost;
  
  
  public SmartPhone() {
	  System.out.println("no-arg constructer");
  }
   public SmartPhone(String network,int storage,String name,double cost) {
	   this.network=network;
	   this.storage=storage;
	   this.name=name;
	   this.cost=cost;
	   
   }
   public void print() {
		 System.out.println("Network:"+this.network);
		 System.out.println("Storage:"+this.storage);
		 System.out.println("Name:"+this.name);
		 System.out.println("Cost:"+this.cost);
   }
}
