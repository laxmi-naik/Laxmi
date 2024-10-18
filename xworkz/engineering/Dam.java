package com.xworkz.engineering;

public class Dam {
	private String[]  Dams=new String[7];
	private  int position;
	   
	   
	   public void save(String  dam) {
		   this. Dams[position]= dam;
		     position++;
	   }
	   public void show() {
		   for(String ref: Dams) {
			 System.out.println(ref);
		   }
	   }
}
