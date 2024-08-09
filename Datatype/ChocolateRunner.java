class ChocolateRunner{
	public static void main(String[] args){
		Chocolate chocolate=new Chocolate(50);
		chocolate.size='s';
		chocolate.setFlavour("dark");
		chocolate.display();
		
		Chocolate chocolate1=new Chocolate(100);
		chocolate1.size='m';
		chocolate1.setFlavour("milk");
		chocolate1.display();
		
		Chocolate chocolate2=new Chocolate(150);
		chocolate2.size='L';
		chocolate2.setFlavour("white");
		chocolate2.display();
	}
}