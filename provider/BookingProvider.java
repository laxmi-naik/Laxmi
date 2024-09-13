package com.xworks.provider;

public class BookingProvider extends Provider {
	public BookingProvider(String name, String ceoName) {
		super(name,ceoName);
		System.out.println("const with argu.....");
	}
	@Override
	public void service() {
		System.out.println("running service method in BookingProvider");
	}
	
	
}
