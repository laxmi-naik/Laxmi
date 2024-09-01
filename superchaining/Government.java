package com.xworks.inheritance.superchaining;

public class Government {
 public String state;
 public int noOfMlas;
 public String partyHeadName;
 public String homeMinisterNmae;
public Government(String state, int noOfMlas, String partyHeadName, String homeMinisterNmae) {
	super();
	this.state = state;
	this.noOfMlas = noOfMlas;
	this.partyHeadName = partyHeadName;
	this.homeMinisterNmae = homeMinisterNmae;
}
public Government(String state, String partyHeadName) {
	super();
	this.state = state;
	this.partyHeadName = partyHeadName;
}
 public void show() {
	 System.out.println("State:"+this.state);
	 System.out.println("NO OF MLAs:"+this.noOfMlas);
	 System.out.println("partyHeadName:"+this.partyHeadName);
	 System.out.println("homeMinisterNmae:"+this.homeMinisterNmae);
 }
}
