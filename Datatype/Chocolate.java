class Chocolate{
	 String brand="nestle";
	 double price;
	 String flavour;
	 char size;
	 public  void display(){
		System.out.println(" brand:"+ this.brand);
		System.out.println(" price:"+ this.price);
		System.out.println("flavour:"+ this.flavour);
		System.out.println("size:"+ this.size);
	}
	public Chocolate(double price){
		this.price=price;
	}
	public void setFlavour(String flavour){
		this.flavour=flavour;
	}
}
