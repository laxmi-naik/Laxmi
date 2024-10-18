package com.xworkz.engineering;

public class Bike {
  private String[] bikes=new String[7];
private  int position;
   
   
   public void save(String bike) {
	   this.bikes[position]= bike;
	     position++;
   }
   public void show() {
	   for(String ref:bikes) {
		 System.out.println(ref);
	   }
   }
   
   
}
