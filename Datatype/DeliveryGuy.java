class DeliveryGuy{
	public static void deliver(String item){
		System.out.println("running deliver in DeliveryGuy");
		DeliveryVehicle.deliver(item,"bengaluru");
		
	}
}