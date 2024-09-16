package com.xworks.interfaces.runner;

import com.xworks.interfaces.media.Bank;

public class BankRunner {

	public static void main(String[] args) {
		Bank bank =new Bank();
		bank.accountNumber(); 
		bank.atmNo();
		bank.balance();
		bank.creditLimit();
		bank.idVerification();
		bank.ifscCode();
		bank.name();
		bank.openingHours();
		bank.queueManagement();
		bank.respectOperatingHours();
		bank.savings();
		bank.securePasswords();
		bank.signatureVerification();
		bank.transactionFee();
		bank.withdrawalLimit();
	}

}
