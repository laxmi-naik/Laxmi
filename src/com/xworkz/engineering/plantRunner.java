package com.xworkz.engineering;
import com.xworkz.engineering.Plant;
public class plantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plant plant1=new Plant("mango","long",50,50.2,1.5);
		Plant plant2=new Plant("rose","small",40,40.2,2.5);
		plant1.settypeOfSoil("blank");
		plant1.setspecies("long");
		plant1.setwaterRequirment(250);
		plant1.setage(5);
		plant1.setcolor("green");
		 
		Plant[] ref=new Plant[1];
		ref[0]=plant1;
		for(String ref:Plant)
			Plant.print();
		}
	}


