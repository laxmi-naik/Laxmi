package com.xworkz.runner;
import com.xworkz.data.Bull;
import com.xworkz.store.Animal;
public class BullRunner {

	public static void main(String[] args) {
		Bull bull=new Animal();
		bull.color="black";
		bull.cost=45000;
		bull.age=9;
		bull.height=3.5f;
		bull.horned="large";
		bull.print();
		

	}

}
