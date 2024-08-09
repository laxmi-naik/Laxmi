class State{
	String name;
	String language;
	CapitalCity capitalCity=new CapitalCity("belgavi",254784);
	 State(){
		System.out.println("Created battery using  no-arg const"); 
	 }
	  State(String name,String language){
		  this.name=name;
		  this.language=language;
	  }
	  public void print(){
		  System.out.println("name:"+this.name);
		  System.out.println("language:"+this.language);
		  this.capitalCity.print();
	  }
}
 
