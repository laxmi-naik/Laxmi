package com.xworkz.engineering;

public class BallRunner {

	public static void main(String[] args) {
		
			Ball ball1=new Ball("football","xyz",20,16,"round","blue","hard",30);
			Ball ball2=new Ball("throwball","abc",15,13,"round","yellow","rough",20);

			ball1.balls("india",500,"leather","rough","littel harder","easy","waterprofe",5,20,"filled",52,"laxmi","rajajinagar",25,"kiran",520,50);

			ball2.balls("india",200,"leather","smooth","smooth","hard","waterprofe",3,25,"hollow",25,"divya","gokak",50,"darshan",250,20);
			
			Ball[] val=new Ball[2];
			val[0]=ball1;
			val[1]=ball2;
			
			for(Ball balldetails:val) {
				
				balldetails.print();
			}
		}

	
	}


