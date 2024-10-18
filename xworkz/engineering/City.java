package com.xworkz.engineering;

public class City {
	private String[] Citys=new String[7];
	private  int position;
	   
	   
	   public void save(String city) {
		   this.Citys[position]= city;
		     position++;
	   }
	   public void show() {
		   for(String ref:Citys) {
			 System.out.println(ref);
		   }
	   }
}
