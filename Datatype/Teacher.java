class Teacher{
	public static String teach(String teacherName){
		System.out.println("running teach in teacher");
		if(teacherName=="Laxmi"){
			return "kannada";
		}
		System.out.println("there is no teacher");
		return "no subject";
	}
	public static void main(String[] args){
		String teacherName=Teacher.teach("Laxmi");
		System.out.println("teacherName is :"+teacherName);
		String teacherOfName=Teacher.teach("samarth");
		System.out.println("teacherName is :"+teacherOfName);
		
	}
}