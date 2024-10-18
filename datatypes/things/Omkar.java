package com.xworks.datatypes.things;

public class Omkar {
	 public void display(Shoe shoe) {
		 if (shoe!=null) {
			 shoe.safeGuard();
			 shoe.enhanceWalk();
			 System.out.println(shoe. brand);
			 
			 }
			 else {
				 System.out.println("divya is null");
			 }
	 }
}
