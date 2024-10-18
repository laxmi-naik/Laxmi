package com.xworkz.engineering;

public class snake {
	String name;
	int length;
	String type;
	
	 public snake (String name,int length,String type) {
		 this.name=name;
		 this.length=length;
		 this.type=type;
	 }
	 public void print() {
		 System.out.println("name:"+this.name);
		 System.out.println("length:"+this.length);
		 System.out.println("type:"+this.type);
	 }
}
