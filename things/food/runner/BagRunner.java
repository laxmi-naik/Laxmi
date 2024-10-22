package com.xworkz.things.food.runner;

public class BagRunner {

	public static void main(String[] args) {
        try{
        	Class.forName("com.xworkz.things.food.Bag");
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
	}

	}

}
