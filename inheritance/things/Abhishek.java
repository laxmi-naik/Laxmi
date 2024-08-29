package com.xworks.inheritance.things;

public class Abhishek {
 private WashingMachine washingMachine;
  public Abhishek(WashingMachine washingMachine) {
	  this.washingMachine=washingMachine;
  }
  public void washdress() {
	  if(washingMachine!=null) {
			 washingMachine.rinse();
			 washingMachine.show();
		 }
		 else {
			 System.out.println("washingMachine is null");
		 }
  }
}
