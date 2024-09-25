package com.xworkz.runtimeException;

public class BrandServiceImp {
 public String Brand;
 public void print(String Brand)throws ValidCostException{
	 if(Brand==null || Brand.equals("")) {
		 System.out.println("invalid exception");
		 throw new ValidCostException();
	 }
	 else {
		 System.out.println("valid exception");
	 }
 }
}
