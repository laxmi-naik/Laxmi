class MedicalRunner{
	public static void main(String[] args){
		System.out.println("running main in MedicalRunner ");
		double price=Medical.medicine("misoprostol");
		System.out.println("price:"+price);
		double costPrice=Medical.medicine("Ativan");
		System.out.println("price:"+costPrice);
		double costOfPrice=Medical.medicine("Amoxicillin");
		System.out.println("price:"+costOfPrice);
		double costOfPriceNo=Medical.medicine("dolo650");
		System.out.println("price:"+costOfPriceNo);
		String name=Medical.name("to prevent nonsteroidal");
		System.out.println("Price:"+name);
		
		 name=Medical.name("to treat anxiety");
		System.out.println("Price:"+name);
		
	     name=Medical.name("to treat bacterial infections");
		System.out.println("Price:"+name);
		
		 name=Medical.name("reduce fever and relieve pain");
		System.out.println("Price:"+name);
		
		
		
		boolean availability=Medical.availability("dr.bhavya");
		System.out.println("Price:"+availability);
		
		 availability=Medical.availability("dr.sumati");
		System.out.println("Price:"+availability);
		
		 availability=Medical.availability("dr.swati");
		System.out.println("Price:"+availability);
		
		 availability=Medical.availability("dr.anu");
		System.out.println("Price:"+availability);
		
		
	
		
	}
}