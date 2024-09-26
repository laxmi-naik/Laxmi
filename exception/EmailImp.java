package com.xworkz.exception;

public class EmailImp {
	public String email;
public void  save( String email) throws Exception {
	if(email=="@"  && email.equals(".com")) {
		System.out.println("valid exception");
		
	}
	else {
		System.out.println("in valid exception");
		throw new  ValidEmailException();
	}
}


}
