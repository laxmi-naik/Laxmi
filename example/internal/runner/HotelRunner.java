package com.xworkz.example.internal.runner;

import com.xworkz.example.internal.Hotel;
import com.xworkz.example.internal.RoyalHotel;

public class HotelRunner {
	public static void main(String[] args) {
		Hotel hotel =new RoyalHotel();
		hotel.print();
	}
}
