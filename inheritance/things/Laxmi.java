package com.xworks.inheritance.things;

public class Laxmi {
public void spin(WashingMachine washingMachine) {
	 if(washingMachine!=null) {
		 washingMachine.rinse();
		 washingMachine.show();
	 }
	 else {
		 System.out.println("washingMachine is null");
	 }
}
}
