class PaperRunner{
	public static void main(String[] args){
		Paper paper=new Paper("A4");
		paper.thickness=3.5;
		paper.setQuality("good");
		paper.display();
		
		Paper paper1=new Paper("A3");
		paper1.thickness=4.5;
		paper1.setQuality("transfarent");
		paper1.display();
		
		Paper paper2=new Paper("A2");
		paper2.thickness=6.5;
		paper2.setQuality("midium");
		paper2.display();
	}
}