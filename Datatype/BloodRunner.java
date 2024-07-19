class BloodRunner{
	public static void main(String[] args){
		System.out.println("running main in BloodRunner");
		char Group = Blood.group();
		System.out.println("group:"+Group);
		String Name = Blood.person();
		System.out.println("personName:"+Name);
		double Cost = Blood.cost();
		System.out.println("cost:"+Cost);
		String hospitalTested=Blood.hospitalTested();
		System.out.println("hospitalTested:"+hospitalTested);
		boolean sickness=Blood.sick();
		System.out.println("sickness:"+sickness);
		boolean donate=Blood.donate();
		System.out.println("donate:"+donate);
	}
}