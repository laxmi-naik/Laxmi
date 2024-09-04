package com.xworks.data.typeinheritance.runner;

import com.xworks.data.typeinheritance.Dog;

public class AnimalRunner {

	public static void main(String[] args) {
		Dog dog=new Dog("white",'F');
		dog.display();
		dog.print();
	}

}
