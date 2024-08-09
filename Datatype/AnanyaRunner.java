class AnanyaRunner{
	public static void main(String[] args){
		Knife knife=new Knife(25.6,6.4);
		Ananya ananya=new Ananya(9844312496l,knife);
		ananya.details();
		System.out.println("++++++++");
		Knife knife1=new Knife(30.5,5.4);
		Ananya ananya1=new Ananya(8105627594l,knife1);
		ananya1.details();
	}
}