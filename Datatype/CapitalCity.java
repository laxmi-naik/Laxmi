class CapitalCity{
	String name;
	 int population;
	CapitalCity(){
		System.out.println("Created battery using  no-arg const");
	} 
	CapitalCity(String name,int population){
		this.name=name;
		this.population=population;
	}
	public void print(){
		System.out.println("name:"+name);
		System.out.println("population:"+population);
	}
}