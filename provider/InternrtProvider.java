package com.xworks.provider;

public class InternrtProvider extends Provider {

	public InternrtProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	@Override
	public void service() {
		System.out.println("running service method in InternrtProvider");
		
	}
	

}
