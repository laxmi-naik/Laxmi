package com.xworks.provider;

public class DellProvider extends Provider {

	public DellProvider(String name, String ceoName) {
		super(name, ceoName);
		System.out.println("running argu const....");
	}
	@Override
 public void service() {
	 System.out.println("running srevice method in DellProvider ");
 }
}
