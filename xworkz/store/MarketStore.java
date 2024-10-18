package com.xworkz.store;

import com.xworkz.data. MarketData;

public class MarketStore {
	private MarketData[] market=new MarketData[5];
	private  int position=0;
	   
	   
	   public void save(MarketData Market) {
		   this.market[this.position]= Market;
		     this.position++;
	   }
	   public void show() {
		   for(MarketData ref:market) {
			   if ( ref != null) {
				   ref.display();
				   } else {
				   System.out.println("Data is null");
				   }

		   }
	   }

}
