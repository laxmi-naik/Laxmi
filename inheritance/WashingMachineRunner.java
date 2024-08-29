package com.xworks.inheritance;


import com.xworks.inheritance.things.Abhishek;
import com.xworks.inheritance.things.Bhumika;
import com.xworks.inheritance.things.Laxmi;
import com.xworks.inheritance.things.Megha;
import com.xworks.inheritance.things.Nayana;
import com.xworks.inheritance.things.WashingMachine;

public class WashingMachineRunner {

	public static void main(String[] args) {
		Megha megha=new Megha();
		megha.wash();
		
		
		Laxmi laxmi =new Laxmi();
		WashingMachine washingMachine=new WashingMachine("lg", "spring", 25);
		laxmi.spin(washingMachine);
		
		
		WashingMachine washingMachine1=new WashingMachine("bosch", "lock", 25);
		Abhishek abhishek=new Abhishek(washingMachine1);
		abhishek.washdress();
		
		
		Bhumika bhumika=new Bhumika();
		bhumika.spindress();
		
		Nayana nayana=new Nayana();
		nayana.take();
	}

}
