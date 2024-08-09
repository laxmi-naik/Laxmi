class Countri {
	String name;
	String continent;
	State state=new State("karnataka","kannada");
	Countri(){
		System.out.println("Created battery using  no-arg const");
	}
	Countri(String name,String continent){
		this.name=name;
		this.continent=continent;
	}
	public void print(){
		System.out.println("name:"+this.name);
		System.out.println("continent:"+this.continent);
		this.state.print();
	}
	
	
	
	
}
 