class Code{
	
	public static String nameOfCountry(int code){
		
	System.out.println("running nameOfCountry in code");
	
	if(code==91)
	{
		return "India";
	}
	if(code==52)
	{
		return "mexico";
	}
	if(code==86)
	{
		return "china";
	}
	if(code==27)
	{
		return " south africa";
	}
	if(code==19)
	{
		return "jamaica";
	}
	
	System.out.println("country doesnot defined");
		return "unknown country";
		
	}	
	public static double price(String item)
	{
		
	System.out.println("running price in code");
	
	if(item=="foundation")
	{
		return 100;
	}
	if(item=="mascara")
	{
		return 50;
	}
	if(item=="eyeshadow")
	{
		return 200;
	}
	if(item=="blush")
	{
		return 110;
	}
	if(item=="lipstick")
	{
		return 150;
	}
	
	System.out.println("items are not there");
		return 0;
	
	}
	
	
	public static String ProducerName(String movieName)
	{
		
	System.out.println("running ProducerName in code");
	
	if(movieName=="kalki")
	{
		return "nag Ashwin";
	}
	if(movieName=="kantara")
	{
		return "rakshit shetty";
	}
	if(movieName=="rangi taranga")
	{
		return "prakash";
	}
	if(movieName=="vikrant rona")
	{
		return "anup bhandari";
	}
	if(movieName=="Appu")
	{
		return"parvathamma rajkumar";
	}
	
	System.out.println(" movie is not there in list");
		return "there is no movie";
	
	}
	
}