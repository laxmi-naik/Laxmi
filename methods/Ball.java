class Ball{
	public static void drop()
	{
		System.out.println("running drop in Ball");
		Ball.hold();
	}
	public static void hold()
	{
		System.out.println("running hold in Ball");
		Ball.take();
	}
	public static void take()
	{
		System.out.println("running take in Ball");
		Ball.give();
	}
	public static void give()
	{
		System.out.println("running give in Ball");
		Ball.push();
	}
	public static void push()
	{
		System.out.println("running push in Ball");
	}
}