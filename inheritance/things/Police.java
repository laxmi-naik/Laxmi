package com.xworks.inheritance.things;

public class Police {
 public void mar(Gun gun) {
	 if(gun!=null) {
		 gun.fire();
	    gun.display();
	 }
	 else {
		 System.out.println("gun is null");
	 }
 }
}
