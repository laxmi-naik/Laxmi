package com.xworks.laxmi.internal;

public class Toothpaste {
    private String company;
    private boolean salt;
     public Toothpaste(String company){
    	this.company=company;
    	System.out.println("running Toothpaste");
    }
     public Toothpaste(String company,boolean salt) {
    	 this.company=company;
    	 this.salt=salt;
    	 System.out.println("running Toothpaste");
     }
     public void display() {
    	 System.out.println("Company:"+this.company);
    	 System.out.println("Salt:"+this.salt);
    	System.out.println("running display in Toothpaste");
     }
}
