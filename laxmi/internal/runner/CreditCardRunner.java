package com.xworks.laxmi.internal.runner;

import com.xworks.laxmi.internal.CreditCard;

public class CreditCardRunner {

	public static void main(String[] args) {
		CreditCard creditCard1 =new CreditCard("visa", 123, 10000, "25/06/2024", 5000, 2);
		CreditCard creditCard2 =new CreditCard("master", 456, 25000, "31/03/2026", 10000, 3);
		boolean ref=creditCard1.equals(creditCard2);
		System.out.println("creditCard1 is equals to creditCard2:"+ref);

	}

}
