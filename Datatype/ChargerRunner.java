class ChargerRunner{

	public static void main(String[] args){
		System.out.println("start main in ChargerRunner ");
		Charger charger =new Charger();
		 String pin= charger.cPin;
		 double price=charger.cPrice;
		  int capacity=charger.capacity;
		System.out.println("charger pin :"+pin);
			System.out.println("charger price:"+price);
				System.out.println("charger capacity:"+capacity);
				System.out.println("+++++++++++++");
				Clock clock =new Clock();
		 int time = clock.time;
		 String brand=clock.clockBrand;
		  double price1=clock.clockPrice;
		System.out.println("clock time :"+time);
			System.out.println("clock brand:"+brand);
				System.out.println("clock price:"+price1);
				System.out.println("+++++++++++++");
					System.out.println("+++++++++++++");
				Lolipop lolipop =new Lolipop();
		String flavour = lolipop.flavour;
		double lPrice=lolipop.lolipopPrice;
		  String manuDate=lolipop.manufacturDate;
		System.out.println("lolipop flavour:"+flavour);
			System.out.println("lolipop price:"+lPrice);
				System.out.println("lolipop manuDate:"+manuDate);
				System.out.println("+++++++++++++");
				Crow crow =new Crow();
		String color = crow.color;
		float  weight=crow.weight;
		  int crowCapacity=crow.crowCapacity;
		System.out.println("crow color:"+color);
			System.out.println("crow weight:"+weight);
				System.out.println("crowCapacity:"+crowCapacity);
				System.out.println("+++++++++++++");
				Jean jean=new Jean();
	String ref1=jean.jName;
	int ref2=jean.size;
	double ref3=jean.jprice;
	System.out.println("jName:" +ref1);
	System.out.println("size:" +ref2);
	System.out.println("jprice:" +ref3);
	
	System.out.println("+++++++++++");
	
	
	Keyboard keyboard=new Keyboard();
	String keyboardname=keyboard.kname;
	int noOfButtons=keyboard.noOfButton;
	String color1=keyboard.color;
	System.out.println("keyboardName:"+keyboardname);
	System.out.println("noOfButtons:"+noOfButtons);
	System.out.println("color:"+color1);
	
	System.out.println("+++++++++");
	
	
	Mountain mountain=new Mountain();
	String mountainName=mountain.mountainName;
	int height=mountain.height;
	int area=mountain.area;
	System.out.println("mountainName:"+mountainName);
	System.out.println("height:"+height);
	System.out.println("area:"+area);
	
	System.out.println("+++++++");
	
	
	Stadium stadium=new Stadium();
	String sname=stadium.sname;
	int capacity1=stadium.capacity;
	String loc=stadium.location;
	System.out.println("sname:"+sname);
	System.out.println("capacity:"+capacity1);
	System.out.println("loc:"+loc);
	
	System.out.println("++++++++++");
	
	
	Spray spray=new Spray();
	String sprayname=spray.sprayname;
	int quantity=spray.quantity;
	double price2=spray.price;
	System.out.println("sprayname:"+sprayname);
	System.out.println("quantity:"+quantity);
	System.out.println("price:"+price2);
	
	
	System.out.println("+++++++++++");
	
	
	Claw claw=new Claw();
	String material=claw.material;
	int sharp=claw.sharp;
	double length=claw.len;
	System.out.println("length:"+length);
	System.out.println("sharp:"+sharp);
	System.out.println("length:"+length);
}
}