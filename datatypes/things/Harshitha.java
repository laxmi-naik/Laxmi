package com.xworks.datatypes.things;

public class Harshitha {
 public Shoe shoe;
 public void show() {
	 if(shoe!=null) {
		 shoe.safeGuard();
		shoe.enhanceWalk();
		 System.out.println(shoe.cost);
	 }
	 else {
		 System.out.println("shoe is null"); 
	 }
 }
 }

