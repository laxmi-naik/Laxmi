package com.xworks.inheritance.things;

public class Anu {
private Dress dress;
  public Anu(Dress dress) {
	  this.dress=dress;
  }
  public void take( ) {
		 if(dress!=null) {
			 dress. wear();
			 dress.tear();
		 }
		 else {
			 System.out.println("dress is null");
		 }
	}
}
