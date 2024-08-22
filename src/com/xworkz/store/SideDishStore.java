package com.xworkz.store;

import com.xworkz.data.SideDishData;

public class SideDishStore {
	private SideDishData[] sideDish=new SideDishData[5];
	private  int position=0;
	   
	   
	   public void save(SideDishData SideDish) {
		   this.sideDish[this.position]= SideDish;
		     this.position++;
	   }
	   public void show() {
		   for(SideDishData ref:sideDish) {
			   if ( ref != null) {
				   ref.display();
				   } else {
				   System.out.println("Data is null");
				   }

		   }
	   }

}
