class Projector{
	String company;
	 String type;
	 String color="white";
	 double weight;
	 public  void display(){
		System.out.println(" company:"+ this.company);
		System.out.println(" type:"+ this.type);
		System.out.println("color:"+ this.color);
		System.out.println("weight:"+ this.weight);
	}
	public Projector(String company)
	{
		this.company=company;
		
	}
	public void setType(String type){
		this.type=type;
	}
}
