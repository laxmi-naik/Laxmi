package com.xworks.datatypes;

import com.xworks.datatypes.things.Hat;
import com.xworks.datatypes.things.Rajkumar;
import com.xworks.datatypes.things.Upendra;
import com.xworks.datatypes.things.Yash;

public class HatRunner {

	public static void main(String[] args) {
		Upendra upendra=new Upendra();
		upendra.wear();
		
		
 Yash yash=new Yash();
 Hat hat= new Hat();
 yash.tear(hat);
 
 Rajkumar rajkumar=new Rajkumar();
 rajkumar. hat=new Hat();//if we have literal variable name directly initialized and other way to initialize Hat hat2=new Hat();rajkumar.hat=hat2;
 rajkumar.fold();

	}

}
