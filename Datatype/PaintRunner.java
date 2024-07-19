class PaintRunner{
	public static void main(String[] args){
		System.out.println("running main in paintRunner");
		Paint.draw("Berger paints");
		Paint.draw("Berger paints", "red");
		Paint.draw("Berger paints",875.35);
		Paint.draw("red","aluminum paint",875.35);
		Train.book("Terdal","bengaluru");
		Train.book("terdal","bengaluru",56);
		Train.book("terdal","bengaluru",56,78.50);
		Train.cancel(149);
		Train.cancel("terdal","bengaluru");
		Book.read("the complete works");
		Book.write("the complete works",1000.25);
		Book.buy("the complete works",1000.25,150);
		Book.give("the complete works",1000.25,150,5166);
		Book.take("the complete works",1000.25,150,5166,"Swami Vivekananda");
		
		
	}
}