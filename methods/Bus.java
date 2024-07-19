class Bus{
public static void move()
		{
			System.out.println("running move in Bus");
			stop();
		}
		public static void stop()
		{
			System.out.println("running stop in Bus");
			move();
		}
}