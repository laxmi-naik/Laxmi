package com.xworkz.runner;
import com.xworkz.data.Chicken;
import com.xworkz.store.Bird;
public class ChickenRunner {

	public static void main(String[] args) {
		Chicken chicken=new Bird();
		chicken.color="white";
		chicken.type="hybrid";
		chicken.cost=150;
		chicken.size='s';
		chicken.height=2.4f;
		chicken.weight=1.5f;
		chicken.gender='F';
		chicken.eggSize="normal";
		chicken.eggColor="white";
		chicken.eggCost=7;
		chicken.print();

	}

}
