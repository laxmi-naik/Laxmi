package com.xworks.inheritance.things;

public class Dboss {
	
 private Gun gun;
 

 public Dboss(Gun gun) {
	super();
	this.gun = gun;
}


public void blast() {
	 if(gun!=null) {
		 gun.fire();
	    gun.display();
	   
	 }
	 else {
		 System.out.println("gun is null");
	 }
 }
}
