package com.xworkz.things.food.runner;

public class PhoneRunner {

	public static void main(String[] args) {
		try{
			Class.forName("com.xworkz.things.food.Phone");
		}
		catch(ClassNotFoundException e) {
            e.printStackTrace();
	}

	}

}
