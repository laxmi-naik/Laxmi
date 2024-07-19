class BookRunner{
	public static void main(String[] args){
		System.out.println("running main in BookRunner");
		
		Book.read();
		Book.write();
		Book.open();
		Book.close();
		Book.take();
		Book.give();
		Book.buy();
		Book.share();
		Book.find();
		Book.sell();
	}
}