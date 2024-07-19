class Person{
	public static void main(String[] person){
		System.out.println("running main in person");
		if( person.length==4){
		String name= person[0];
		String email= person[1];
		String age= person[2];
		String password= person[3];
		
		System.out.println("personName:"+name);
		System.out.println("personEmail:"+email);
		System.out.println("personAge:"+age);
		System.out.println("personPassword:"+password);
		}
		else{
			System.out.println("run");
		}
	}
	
}