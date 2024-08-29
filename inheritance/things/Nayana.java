package com.xworks.inheritance.things;

public class Nayana {
	WashingMachine washingMachine=new WashingMachine("hp", "spring", 40);
	public void take() {
		washingMachine.rinse();
		washingMachine.show();
}
}
