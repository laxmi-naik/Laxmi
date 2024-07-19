class  BuyRunner1{
	public static void main(String[] args ){
		System.out.println("running main in BuyRunner1");
		Buy1.product("Amazon",150);
		Buy1.product("Nike",250);
		Buy1.product("top",2,"good",100);
		Buy1.product("top",11,"good",100);
		Buy1.bookMovieTicket("kalki","Navrang theater",1,100);
		Buy1.bookMovieTicket("kalki","Navrang theater",1,260);
		Buy1.buyEgg(4,8);
		Buy1.buyEgg(11,8);
		Buy1.buyShampoo( 4,50,"dove","05/06/2024");
		Buy1.buyShampoo( 6,70,"dove","07/04/2024");
		Buy1.buyCake('s',"chocalate","red velvet",300,1);
		Buy1.buyCake('m',"chocalate","red velvet",400,2);
		Buy1.buyLaptop("hp",05,50000,2200,13.3,"windows",2,16);
		Buy1.buyLaptop("hp",06,50000,2200,13.3,"windows",2,16);
		Buy1.buySmartWatch("samsung",2000,2,'A',2);
		Buy1.buySmartWatch("samsung",2000,9,'A',3);
		
		
		
		
	}
}