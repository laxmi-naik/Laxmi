package com.xworkz.store;
import com.xworkz.data.SandalData;
public class SandalStore {
	private SandalData[] sandal=new SandalData[5];
	private  int position=0;
	   
	   
	   public void save(SandalData Sandal) {
		   this.sandal[this.position]= Sandal;
		     this.position++;
	   }
	   public void show() {
		   for(SandalData ref:sandal) {
			   if ( ref != null) {
				   ref.display();
				   } else {
				   System.out.println("Data is null");
				   }

		   }
	   }
}
