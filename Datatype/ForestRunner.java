class ForestRunner{
	public static void main(String[] forestName){
		if( forestName.length==4){
			String name = forestName[0];
			String area=forestName[1];
			String establishedYear=forestName[2];
			String state=forestName[3];
			
			System.out.println("forestName:"+name);
			System.out.println("forestarea:"+ area);
			System.out.println(establishedYear);
			System.out.println("foreststate:"state);
		}
		else{
			System.out.println("forest");
		}
	}
}