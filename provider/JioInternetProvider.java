package com.xworks.provider;

public class JioInternetProvider extends InternrtProvider {

	public JioInternetProvider(String name, String ceoName) {
		super(name, ceoName);
		
	}

	@Override
	public void service() {
		System.out.println("running service method in JioInternetProvider");
	}
	

}
