package com.xworks.inheritance;

import com.xworks.inheritance.things.Anu;
import com.xworks.inheritance.things.Bhavya;
import com.xworks.inheritance.things.Dress;
import com.xworks.inheritance.things.Samarth;
import com.xworks.inheritance.things.Swati;

public class DressRunner {

	public static void main(String[] args) {
		Bhavya bhavya=new Bhavya();
	    bhavya.buy();
		
		Swati swati=new Swati();
		Dress dress=new Dress("biba",'m',600);
		swati.give(dress);
		
		Dress dress1=new Dress("adidas",'x',600);
		Anu anu=new Anu(dress1);
		anu.take();
		
		
		Samarth samarth=new Samarth();
		samarth.sitch();
	}

}
