package com.xworkz.runtimeException;

public class ValidCostException extends RuntimeException {
public ValidCostException() {
	super();
	System.out.println("running no arg const in ValidCostException");
}
}
