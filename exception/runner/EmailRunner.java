package com.xworkz.exception.runner;

import com.xworkz.exception.EmailImp;

public class EmailRunner {

	public static void main(String[] args) throws Exception {
	
		
				EmailImp  emailImp=new EmailImp();
				emailImp.save("@.com");
			}

	}


