package com.xworks.concepts;
//final
public final class Train {
	 private  int no;
	 private String source;
	 private String destination;
	 

	public Train(int no, String source, String destination) {
		super();
		this.no = no;
		this.source = source;
		this.destination = destination;
	}
	public final void display() {
		System.out.println(no);
		System.out.println(source);
		System.out.println(destination);
	}
}
