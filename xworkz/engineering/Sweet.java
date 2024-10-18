package com.xworkz.engineering;

public class Sweet {
	private String[] Sweets=new String[7];
	private  int position;
	   
	   
	   public void save(String sweet) {
		   this.Sweets[position]= sweet;
		     position++;
	   }
	   public void show() {
		   for(String ref:Sweets) {
			 System.out.println(ref);
		   }
	   }
}
