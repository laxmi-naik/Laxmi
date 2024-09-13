package com.xworks.provider;

public class LenovoProvider extends Provider {
private int profit;
	public LenovoProvider(String name, String ceoName,int profit) {
		super(name, ceoName);
		this.profit=profit;
	
	}

	@Override
	public String toString() {
		return "LenovoProvider [profit=" + profit + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void service() {
		System.out.println("running service method in LenovoProvider");
		
	}
	

}
