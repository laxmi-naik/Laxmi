package com.xworkz.runner;

import com.xworkz.data.SideDishData;
import com.xworkz.store.SideDishStore;

public class SideDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SideDishStore SideDishs=new SideDishStore();
		
		SideDishData SideDish1= new  SideDishData("potato",100,"veg");
		SideDishData SideDish2= new  SideDishData("fries",200,"veg");
		SideDishData SideDish3= new  SideDishData("chicken lollipop",400,"non-veg");
		SideDishData SideDish4= new  SideDishData("pickl",150,"veg");
		SideDishData SideDish5= new  SideDishData("pizza",350,"veg");
		SideDishs.show();
		SideDishs.save(SideDish1);
		SideDishs.save(SideDish2);
		SideDishs.save(SideDish3);
		SideDishs.save(SideDish4);
		SideDishs.save(SideDish5);
		SideDishs.show();
	}

}
