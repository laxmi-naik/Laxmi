class Medical{
	public static double medicine(String medicineName){
	System.out.println("running medicinein medical");
    System.out.println("medicineName is :"+medicineName);
     if (medicineName=="misoprostol"){
		 System.out.println("medicine name is misoprostol");
		 return 50;
	 }
      if (medicineName=="Ativan"){
		 System.out.println("medicine name is Ativan");
		 return 200;
	 }	
     if(medicineName=="Amoxicillin"){
	System.out.println("medicine name is Amoxicillin");	
	return 100;
	}	 
	System.out.println("there is no medicine");
	return 0;
	}
	public static String name(String symptom){
		
		System.out.println("running name in medicine");
	
	if(symptom=="to prevent nonsteroidal")
	{
		return "misoprostol" ;
	}
	if(symptom=="to treat anxiety")
	{
		return "Ativan";
	}
	if(symptom=="to treat bacterial infections")
	{
		return "Amoxicillin";
	}
	
	System.out.println("tablet is not there");
		return "unknown tablet";
	}
	
	
	public static boolean availability(String doctorName){
		
		System.out.println("running availability in medicine");
	
	if(doctorName=="dr.bhavya")
	{
		return false ;
	}
	if(doctorName=="dr.sumita")
	{
		return true;
	}
	if(doctorName=="dr.swati")
	{
		return false;
	}
	
	System.out.println("availability of doctor");
		return true;
	}
}
