package com.xworks.inheritance.superchaining;

public class Train {
 public  int no;
 public String source;
 public String destination;
 

public Train(int no, String source, String destination) {
	super();
	this.no = no;
	this.source = source;
	this.destination = destination;
}


public Train(int no, String destination) {
	super();
	this.no = no;
	this.destination = destination;
}
public void display() {
	System.out.println("No:"+this.no);
	System.out.println("Source:"+this.source);
	System.out.println("Destination:"+this.destination);
}
}