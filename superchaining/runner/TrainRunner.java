package com.xworks.inheritance.superchaining.runner;

import com.xworks.inheritance.superchaining.MetroTrain;
import com.xworks.inheritance.superchaining.SubUrbanTrain;

public class TrainRunner {

	public static void main(String[] args) {
		MetroTrain metroTrain=new MetroTrain(50,"belgavi");
		metroTrain.display();
		MetroTrain metroTrain1=new MetroTrain(80,"bengaluru");
		metroTrain1.display();
		
		
		SubUrbanTrain subUrbanTrain=new SubUrbanTrain(50,"haveri");
		subUrbanTrain.display();
		SubUrbanTrain subUrbanTrain1=new SubUrbanTrain(80,"kudachi");
		subUrbanTrain1.display();

	}

}
