class JuiceShopRunner{
	public static void main(String[] medicines){
		if(medicines.length==4){
			String name =medicines[0];
			String manfdate=medicines[1];
			String price=medicines[2];
			String quantity=medicines[3];
			
			 float converedprice = Float.parseFloat(price);
			 int converedquantity=Integer.parseInt(quantity);
			 
			 JuiceShop.medicine(name,manfdate,converedprice,converedquantity );
			 
			 
		}
		else if  (medicines.length==5){
			String name =medicines[0]; 
			String brand =medicines[1];
			String flavour=medicines[2];
			String price =medicines[3];
			String quantity=medicines[4];
			
			float converedprice = Float.parseFloat(price);
			 int converedquantity=Integer.parseInt(quantity);
			 
			 JuiceShop.juice(name,brand,flavour,converedprice,converedquantity);
		}
		
	}
}