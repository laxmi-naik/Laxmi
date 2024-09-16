package com.xworks.interfaces;

public interface BankRule {
 public	double balance();
 public String name();
 public	double savings();
 public	double withdrawalLimit();
 public	String accountNumber();
 public	double transactionFee();
 public	double creditLimit();
 public	int atmNo();
 public	int openingHours();
 public	String ifscCode();
 public boolean signatureVerification();
 public boolean idVerification();
 public boolean queueManagement();
 public boolean securePasswords();
 public boolean respectOperatingHours();
}
