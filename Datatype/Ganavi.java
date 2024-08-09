class Ganavi{
	String email;
	 Clip clip;
	 Ganavi(String email,Clip clip){
		 this.email=email;
		 this.clip=clip;
	 }
	 public void details(){
		 System.out.println("email:"+email);
		 this.clip.details();
	 }
}