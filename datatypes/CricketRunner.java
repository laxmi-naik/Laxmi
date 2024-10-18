package com.xworks.datatypes;

import com.xworks.datatypes.things.Bumrah;
import com.xworks.datatypes.things.Cricket;
import com.xworks.datatypes.things.Dhawan;
import com.xworks.datatypes.things.Hardik;

public class CricketRunner {

	public static void main(String[] args) {
		Dhawan dhawan =new Dhawan();
		dhawan.give();
		
		Bumrah bumrah=new Bumrah();
		bumrah.take(null);
		
		
		Hardik hardik=new Hardik();
		hardik.cricket=new Cricket();
		hardik.print();
	}

}
