package com.xworks.textfile;

public class PersonInfo {
private String  name;
private String email;
private int age;
private long mobileNo;

public PersonInfo(String name, String email, int age, long mobileNo) {
	super();
	this.name = name;
	this.email = email;
	this.age = age;
	this.mobileNo = mobileNo;
}
public void print() {
	System.out.println("Name:"+name);
	System.out.println("Email:"+email);
	System.out.println("Age:"+age);
	System.out.println("MobileNo:"+mobileNo);
}

}
