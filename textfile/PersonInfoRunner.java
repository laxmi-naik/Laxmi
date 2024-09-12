package com.xworks.textfile;

public class PersonInfoRunner {

	public static void main(String[] args) {
		PersonInfo personInfo1=new PersonInfo("Laxmi", "laxmi@gmail.com", 21, 9844312496l);
		PersonInfo personInfo2=new PersonInfo("Bhavya", "bhavya@gmail.com", 23, 76676663997l);
		PersonInfo personInfo3=new PersonInfo("Swati", "swati@gmail.com", 18, 8105627594l);
		PersonInfo personInfo4=new PersonInfo("Anu", "anu@gmail.com", 16, 9844312494l);
		PersonInfo personInfo5=new PersonInfo("Samarth", "samarth@gmail.com", 12, 9844312486l);
		
		PersonInfo[] person= {personInfo1,personInfo2,personInfo3,personInfo4,personInfo5};
		
		for(PersonInfo personInfo:person) {
			if(personInfo!=null) {
				personInfo.print();
			}
			else {
				System.out.println("print null");
			}
		}

	}

}
