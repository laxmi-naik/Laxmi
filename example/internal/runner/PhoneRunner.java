package com.xworkz.example.internal.runner;

import com.xworkz.example.internal.Mobile;
import com.xworkz.example.internal.Phone;

public class PhoneRunner {
	public static void main(String[] args) {
		Phone phone=new Phone();
		System.out.println(phone.getbrand());
		
		
		System.out.println("++++++++++++++++");
		
		
		Mobile mobile =new Mobile();
		mobile.setbrand("realme");
		System.out.println(mobile.getbrand());
	}
}
