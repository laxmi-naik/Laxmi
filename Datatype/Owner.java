class Owner {
	  String name;
	  int age;
	  char gender;
	  Owner(){
		  System.out.println("created Owner");
	  }
	  Owner(String name,int age,char gender){
		  this.name=name;
		  this.age=age;
		  this.gender=gender;
	  }
	  public void display(){
		  System.out.println("name:"+this.name);
		  System.out.println("age:"+this.age);
		  System.out.println("gender:"+this.gender);
	  }
}
