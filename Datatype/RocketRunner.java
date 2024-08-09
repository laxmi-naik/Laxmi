class RocketRunner{
	public static void main(String[] args)
	{

     Rocket rocket=new Rocket(200);
	 rocket.noOfThrusters=20;
	 rocket.setFuelCapacity(500);
	rocket.display();
	Rocket rocket1=new Rocket(400);
	 rocket1.noOfThrusters=50;
	 rocket1.setFuelCapacity(300);
	rocket1.display();
	Rocket rocket2=new Rocket(600);
	 rocket2.noOfThrusters=30;
	 rocket2.setFuelCapacity(700);
	rocket2.display();
	}
}