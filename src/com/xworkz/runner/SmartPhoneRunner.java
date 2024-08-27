package com.xworkz.runner;

import com.xworkz.data.SmartPhone;
import com.xworkz.store.PhoneDevice;
public class SmartPhoneRunner {

	public static void main(String[] args) {
		SmartPhone smartPhone=new PhoneDevice();
		smartPhone.network="4G";
		smartPhone.storage=64;
		smartPhone.name="realme";
		smartPhone.cost=40000;
		smartPhone.print();

	}

}
