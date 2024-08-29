package com.xworks.inheritance.things;

public class Soldier {
	 Gun gun=new Gun("shotgun", "india", "rifles");
public void shoot() {
	gun.fire();
	gun.display();
}
}
