package com.xworkz.engineering;
import com.xworkz.engineering.snake;
public class SnakeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		snake snakes1=new snake("laxmi",100,"python");
		snake snakes2=new snake("bhavya",100,"cobra");
		snake snakes3=new snake("swati",100,"normal snake");
		snakes ref=new snakes[3];
		ref[0]=snakes1;
		ref[0]=snakes1;
		ref[0]=snakes1;
		for(String relatives:ref) {
			System.out.println(ref);
			snake.print();
		}
		

	}

}
