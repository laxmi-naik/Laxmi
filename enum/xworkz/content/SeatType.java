package com.xworkz.content;

public enum SeatType {
	RECLINER(11),PREMIUM(10),EXECUTIVE(8);
	private int seatNo;
	private  SeatType(int seatNo) {
		this.seatNo=seatNo;
	}
}
