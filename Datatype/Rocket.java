class Rocket{
	  String country="India";
	 int speed;
	 int fuelCapacity;
	 int noOfThrusters;
	 public  void display(){
		System.out.println(" country:"+ this.country);
		System.out.println(" speed:"+ this.speed);
		System.out.println("fuelCapacity:"+ this.fuelCapacity);
		System.out.println("noOfThrusters:"+ this.noOfThrusters);
	}
	public Rocket(int speed){
		this.speed=speed;
	}
	public void setFuelCapacity( int fuelCapacity){
		this.fuelCapacity= fuelCapacity;
	}
}
	