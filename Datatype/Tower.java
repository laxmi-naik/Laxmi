class Tower{
	
	public static String sentence(String weather){
		
		if(weather=="raning"){
			return "true";
		}
		else {
			return "flase";
		}
		
	}
	public static void main(String[] args){
		
		 String sentence=sentence("raning");
		System.out.println(sentence);
	}
}