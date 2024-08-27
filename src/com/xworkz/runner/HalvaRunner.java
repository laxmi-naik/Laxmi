package com.xworkz.runner;
import com.xworkz.data.Halva;
import com.xworkz.store.Sweet;
public class HalvaRunner {

	public static void main(String[] args) {
		
		Halva halva1=new Sweet();
		
		halva1.flavor="vanilla";
		halva1.cost=150;
		halva1.type="cocoa tahini halva";
		halva1.print();
	}

}
