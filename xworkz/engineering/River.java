package com.xworkz.engineering;

public class River {
	private String[]  Rivers=new String[7];
	private  int position;
	   
	   
	   public void save(String  river) {
		   this. Rivers[position]=  river;
		     position++;
	   }
	   public void show() {
		   for(String ref: Rivers) {
			 System.out.println(ref);
		   }
	   }
}
