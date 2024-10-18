package com.xworkz.runner;
import com.xworkz.store.SandalStore;
import com.xworkz.data.SandalData;
public class Sandal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SandalStore Sandals=new SandalStore();
		
		SandalData sandal1= new SandalData("bata",'s',500,"black");
		SandalData sandal2= new SandalData("puma",'l',100,"white");
		SandalData sandal3= new SandalData("liberty",'m',200,"red");
		SandalData sandal4= new SandalData("bella",'s',300,"green");
		SandalData sandal5= new SandalData("crocs",'L',400,"blue");
		Sandals.show();
		Sandals.save(sandal1);
		Sandals.save(sandal2);
		Sandals.save(sandal3);
		Sandals.save(sandal4);
		Sandals.save(sandal5);
		Sandals.show();
		
	}

}
