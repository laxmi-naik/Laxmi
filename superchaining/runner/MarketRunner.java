package com.xworks.inheritance.superchaining.runner;

import com.xworks.inheritance.superchaining.OnlineMarket;
import com.xworks.inheritance.superchaining.SuperMarket;

public class MarketRunner {

	public static void main(String[] args) {
		SuperMarket superMarket =new SuperMarket("radha shop","terdal");
		superMarket.run();
		
		SuperMarket superMarket1 =new SuperMarket("laxmi shop","haveri");
		superMarket1.run();

		
		OnlineMarket onlineMarket=new OnlineMarket("more","all");
		onlineMarket.run();
		OnlineMarket onlineMarket1=new OnlineMarket("mart","all");
		onlineMarket1.run();
	}

}
