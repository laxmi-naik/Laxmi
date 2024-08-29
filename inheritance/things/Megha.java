package com.xworks.inheritance.things;

public class Megha {
	WashingMachine washingMachine=new WashingMachine("samsung", "normal", 15);
	public void wash() {
		washingMachine.rinse();
		washingMachine.show();
	}
}
