package com.xworks.provider;

public class BookMyShowMovieBookingProvider extends MovieBookingProvider {

private String totalHalls;

public BookMyShowMovieBookingProvider(String name, String ceoName, String totalHalls) {
	super(name, ceoName);
	this.totalHalls = totalHalls;
}

@Override
public void book() {
	
	System.out.println("running book method in BookMyShowMovieBookingProvider");
}

@Override
public void cancel() {
	System.out.println("running cancel method in BookMyShowMovieBookingProvider");
}

@Override
public String toString() {
	return "BookMyShowMovieBookingProvider [totalHalls=" + totalHalls + ", toString()=" + super.toString() + "]";
}

@Override
public void service() {
	
	System.out.println("running sevice method in BookMyShowMovieBookingProvider ");
}



}

