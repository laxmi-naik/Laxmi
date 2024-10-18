package com.xworks.datatypes.things;

public class Hardik {
	public Cricket cricket;
	public void print(){
	  if(cricket!=null) {
		  cricket. bat();
			cricket. bowl();
			cricket. field();
	  }else {
		  System.out.println("Cricket is null" );
	  }
	}
}
