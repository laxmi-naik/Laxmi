class ProjectorRunner{
	public static void main(String[] args){
		Projector projector=new Projector("samsung");
		projector.weight=45;
		projector.setType("lcd");
		projector.display();
		
		Projector projector1=new Projector("zebronics");
		projector1.weight=50;
		projector1.setType("dlp");
		projector1.display();
		
		Projector projector2=new Projector("egate i9");
		projector2.weight=60;
		projector2.setType("led");
		projector2.display();
	}
}