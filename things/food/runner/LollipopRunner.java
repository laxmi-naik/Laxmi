package com.xworkz.things.food.runner;

public class LollipopRunner {

	public static void main(String[] args) {
		try{
			Class.forName("com.xworkz.things.food.Lollipop");
			
		} 
		catch(ClassNotFoundException e) {
             e.printStackTrace();
	}

}
}
