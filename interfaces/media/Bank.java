package com.xworks.interfaces.media;

import com.xworks.interfaces.BankRule;

public class Bank implements BankRule {
	@Override
	public double balance() {
		System.out.println("running balance method in bank");
		return 0;
	}

	@Override
	public String name() {
		System.out.println("running name method in bank");
		return null;
	}
	@Override
	public double savings() {
		System.out.println("running savings method in bank");
		return 0;
	}
	@Override
	public double withdrawalLimit() {
		System.out.println("running withdrawalLimit method in bank");
		return 0;
	}

	

	@Override
	public String accountNumber() {
		System.out.println("running accountNumber method in bank");
		return null;
	}

	@Override
	public double transactionFee() {
		System.out.println("running transactionFee method in bank");
		return 0;
	}

	@Override
	public double creditLimit() {
		System.out.println("running creditLimit method in bank");
		return 0;
	}

	@Override
	public int atmNo() {
		System.out.println("running atmNo method in bank");
		return 0;
	}

	@Override
	public int openingHours() {
		System.out.println("running openingHours method in bank");
		return 0;
	}

	@Override
	public String ifscCode() {
		System.out.println("running ifscCode method in bank");
		return null;
	}

	@Override
	public boolean signatureVerification() {
		System.out.println("running signatureVerification method in bank");
		return false;
	}

	@Override
	public boolean idVerification() {
		System.out.println("running idVerification method in bank");
		return false;
	}

	@Override
	public boolean queueManagement() {
		System.out.println("running queueManagement method in bank");
		return false;
	}

	@Override
	public boolean securePasswords() {
		System.out.println("running securePasswords method in bank");
		return false;
	}

	@Override
	public boolean respectOperatingHours() {
		System.out.println("running respectOperatingHours method in bank");
		return false;
	}

}
