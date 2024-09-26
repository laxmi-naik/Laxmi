package com.xworkz.runtimeException;

public class ValidPriceException extends RuntimeException{
public ValidPriceException() {
	super();
	System.out.println("running no argu const in ValidPriceException");
}
}
