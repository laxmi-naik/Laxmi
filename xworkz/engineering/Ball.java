package com.xworkz.engineering;

public class Ball {


	String name;
	String brand;
	int weight;
	int width;
	String shape;
	String color;
	String type;
	int aircapacity;
	String mafcountry;
	int price;
	String material;
	String texture;
	String hardness;
	String grip;
	String waterprofe;
	int spintime;
	int varinty;
	String coretypeOfBall;
	int gst;
	String storeName;
	String addOfStore;
	int speed;
	String magBy;
	double totalPrice;
	int bouncepersec;
	
	

	
	 public Ball(String name,String brand,int weight,int width,String shape,String color,String type,int aircapacity) {
		 
		 System.out.println("created constructor with parameter");
		 this.name=name;
		 this.brand=brand;
		 this.weight=weight;
		 this.width=width;
		 this.shape=shape;
		 this.color=color;
		 this.type=type;
		 this.aircapacity=aircapacity;
		 
		 
	 }
	 public  void balls(String mafcountry,int price,String material,String texture,String hardness,String grip,String waterprofe,int spintime,
		int varinty,String coretypeOfBall,int gst,String storeName,String addOfStore,int speed,String magBy,double totalPrice,
		int bouncepersec)
	 {
		 this.mafcountry=mafcountry;
		 this.price=price;
		 this.material=material;
		 this.texture=texture;
		 this.hardness=hardness;
		 this.grip=grip;
		 this.waterprofe=waterprofe;
		 this.varinty=varinty;
		 this.coretypeOfBall=coretypeOfBall;
		 this.gst=gst;
		 this.storeName=storeName;
		 this.addOfStore=addOfStore;
		 this.speed=speed;
		 this.magBy=magBy;
		 this.totalPrice=totalPrice;
		 this.bouncepersec=bouncepersec;
		 

	 }
	 
	 public void print()
	 {
		 System.out.println( this.name);
	     System.out.println (this.brand);
	     System.out.println (this.weight);
	     System.out.println (this.width);
	     System.out.println (this.shape);
		 System.out.println (this.color);
		 System.out.println (this.type);
		 System.out.println (this.aircapacity);
		 System.out.println(this.mafcountry);
		 System.out.println(this.price);
		 System.out.println(this.material);
		 System.out.println( this.texture);
		 System.out.println(this.hardness);
		 System.out.println(grip);
		 System.out.println(waterprofe);
		 System.out.println(varinty);
		 System.out.println(coretypeOfBall);
		 System.out.println(gst);
		 System.out.println(storeName);
		 System.out.println(addOfStore);
		 System.out.println(speed);
		 System.out.println(magBy);
		 System.out.println(totalPrice);
		 System.out.println(bouncepersec);
	 }
	 
}

