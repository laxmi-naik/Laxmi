package com.xworkz.runtimeException;

public class PriceImp {
	public double price;
public void accept(double price) {
	 if(price<100) {
		 System.out.println("valid exception");
		
	 }
	 else {
		 System.out.println("in valid exception");
		 throw new ValidCostException();
	 }
}
}
