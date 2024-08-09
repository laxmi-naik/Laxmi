class GanaviRunner{
	public static void main(String[] args){
		Clip clip=new Clip("red","snap");
		Ganavi ganavi=new Ganavi("laxmi@gmail.com",clip);
		ganavi.details();
		System.out.println("++++++++");
		Clip clip1=new Clip("black","claw");
		Ganavi ganavi1=new Ganavi("bhavya@gmail.com",clip1);
		ganavi1.details();
	}
}