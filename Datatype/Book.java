class Book{
	public static void read(String name){
		System.out.println("name:"+ name);
	}
	public static void write(String name,double price ){
	    System.out.println("name:"+ name);
        System.out.println("price:"+ price);		
	}
	public static void buy(String name,double price,int edition ){
	    System.out.println("name:"+ name);
        System.out.println("price:"+ price);
		 System.out.println("edition:"+ edition);
		
	}
		public static void give(String name,double price,int edition, int pageNo){
	    System.out.println("name:"+ name);
        System.out.println("price:"+ price);
		 System.out.println("edition:"+ edition);
		 System.out.println("pageNo:"+ pageNo);
		 
		}
		public static void take(String name,double price,int edition, int pageNo, String author){
	    System.out.println("name:"+ name);
        System.out.println("price:"+ price);
		 System.out.println("edition:"+ edition);
		 System.out.println("pageNo:"+ pageNo);
		 System.out.println("author:"+ author);
		 
		}
	
}