class Hotel {
	 String name="royal";
	  Owner owner =new Owner("bhavya",23,'F');
	  Hotel (){
		 System.out.println("Created battery using  no-arg const");
	  }
	  public void display(){
		  System.out.println("name:"+this.name);
		  this.owner.display();
	  }
}