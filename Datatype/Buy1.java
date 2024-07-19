class Buy1{
	public static void product(String brand ,double price){
		System.out.println("running product in buy1");
		System.out.println("Brand:"+brand);
		System.out.println("Price:"+ price);
		if (price>100 && price>=200 ){
			System.out.println("price is valid");
			
		}else{
			System.out.println("price is in-valid");
		}
	}
	public static void product(String name,int quantity,String quality,double price){
		System.out.println("Name:"+name);
		System.out.println("quantity:"+quantity);
		System.out.println("quality:"+quality);
		System.out.println("price:"+price);
		if(quantity>5 && quantity>=10){
			System.out.println("quantity is valid");
		}else{
			System.out.println("quantity is in-valid");
		}
		
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
		System.out.println("Name:"+name);
		System.out.println("theaterName:"+theaterName);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		if (price>100 && price>=200 ){
			System.out.println("price is valid");
			
		}else{
			System.out.println("price is in-valid");
		}
	}
	public static void buyEgg(int total,double pricePerEgg){
	    System.out.println("total:"+total);
		System.out.println("pricePerEgg:"+pricePerEgg);
		if (total>10 && total>=7 ){
			System.out.println("total of egg is valid");
			
		}else{
			System.out.println("total of egg is in-valid");
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
	    System.out.println("quantityInMl:"+quantityInMl);
		System.out.println("price:"+price);
		System.out.println("brand:"+brand);
		System.out.println("manfDate:"+manfDate);
	    if (quantityInMl>5 && quantityInMl>=6 ){
			System.out.println("quantityInMl is valid");
			
		}else{
			System.out.println("quantityInMl is in-valid");
		}	
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
	    System.out.println("size:"+size);
		System.out.println("type:"+type);
		System.out.println("flavour:"+flavour);
		System.out.println("cost:"+cost);
        System.out.println("quantity:"+quantity);
		if (cost>300 && cost>=400){
			System.out.println("cost is valid");
			
		}else{
			System.out.println("cost is in-valid");
		}	
		
        
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
		System.out.println("brand:"+brand);
		System.out.println("serialNo:"+serialNo);
		System.out.println("price:"+price);
		System.out.println("batteryCapacity:"+batteryCapacity);
		System.out.println("screenSize:"+screenSize);
		System.out.println(" os:"+ os);
		System.out.println("harddiskSize:"+harddiskSize);
		System.out.println("ramSize:"+ramSize);
		if (serialNo>05 && serialNo>=05 ){
			System.out.println("serialNo is valid");
			
		}else{
			System.out.println("serialNo is in-valid");
		}	
	}
	public static void buySmartWatch(String brand,double price,int color,char type,int mode){
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("type:"+type);
        System.out.println(" mode:"+ mode);
		if (color>7 && color>=8 ){
			System.out.println("color is valid");
			
		}else{
			System.out.println("color is in-valid");
		}	
	}
}







