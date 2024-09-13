package com.xworks.provider;

public class AirtelInternetProvider  extends InternrtProvider{

	public AirtelInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}
@Override
	public void service() {
		System.out.println("running service method in AirtelInternetProvider ");
	}

	
	

}
