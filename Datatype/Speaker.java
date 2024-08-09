class Speaker{
	String  brand="samsung";
	int  size;
	double cost;
	String output;
	
	public  void display(){
		System.out.println(" Speaker brand:"+ this.brand);
		System.out.println(" Speaker size:"+ this.size);
		System.out.println("Speaker cost:"+ this.cost);
		System.out.println("Speaker output:"+ this.output);
	}
	public Speaker(String output){
		this.output=output;
	}
	public void setCost(double cost){
		this.cost=cost;
	}
} 


