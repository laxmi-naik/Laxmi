package com.xworks.provider.runner;

import com.xworks.provider.AirtelInternetProvider;
import com.xworks.provider.BookMyShowMovieBookingProvider;
import com.xworks.provider.BookingProvider;
import com.xworks.provider.DellProvider;
import com.xworks.provider.ExtremeAirtelInternetProvider;
import com.xworks.provider.Fast5gExtreme;
import com.xworks.provider.InternrtProvider;
import com.xworks.provider.JioInternetProvider;
import com.xworks.provider.LenovoProvider;
import com.xworks.provider.MovieBookingProvider;
import com.xworks.provider.SatjioInternetProvider;

public class ProviderRunner {

	public static void main(String[] args) {
		BookingProvider bookingProvider=new BookingProvider("swati", "lalita");
		
		
        boolean ref=bookingProvider.equals(null);
        
      System.out.println(ref);
      System.out.println(bookingProvider.toString());
      bookingProvider.service();
      
      System.out.println("+++++++++++");
      
      DellProvider DellProvider =new DellProvider("laxmi", "lalita");
        boolean ref1=DellProvider.equals(DellProvider);
        System.out.println(ref1);
        System.out.println(DellProvider.toString());
        DellProvider.service();
        
        System.out.println("+++++++++++");
        LenovoProvider lenovoProvider1 =new LenovoProvider("bhavya", "chanagond", 25);
        LenovoProvider lenovoProvider2 =new LenovoProvider("bhavya", "chanagond", 25);
        boolean ref2=lenovoProvider1.equals(lenovoProvider2);
        System.out.println(ref2);
        System.out.println(lenovoProvider1.toString());
        lenovoProvider1.service();
        
        System.out.println("+++++++++++");
        
        InternrtProvider internrtProvider=new InternrtProvider("anu", "samarth");
        boolean ref3=internrtProvider.equals(internrtProvider);
        System.out.println(ref3);
        System.out.println(internrtProvider.toString());
        internrtProvider.service();
        
        System.out.println("++++++++++++");
        
        MovieBookingProvider movieBookingProvider =new MovieBookingProvider("kiran", "mahesh");
        boolean ref4=movieBookingProvider.equals(movieBookingProvider);
        System.out.println(ref4);
        System.out.println(movieBookingProvider.toString());
        movieBookingProvider.book();
        movieBookingProvider.cancel();
        movieBookingProvider.service();
        
        System.out.println("++++++++++++++");
        
        BookMyShowMovieBookingProvider bookMyShowMovieBookingProvider=new BookMyShowMovieBookingProvider("laxmi", "divya", "tafseen");
        boolean ref5=bookMyShowMovieBookingProvider.equals(bookMyShowMovieBookingProvider);
        System.out.println(ref5);
        System.out.println(bookMyShowMovieBookingProvider.toString());
        bookMyShowMovieBookingProvider.book();
        bookMyShowMovieBookingProvider.cancel();
        bookMyShowMovieBookingProvider.service();
        
        System.out.println("++++++++++++");
        
        AirtelInternetProvider airtelInternetProvider =new AirtelInternetProvider("laxmi", "teju");
        boolean ref6=airtelInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref6);
        System.out.println(airtelInternetProvider.toString());
        airtelInternetProvider.service();
        
        System.out.println("++++++++++++");
        
        ExtremeAirtelInternetProvider extremeAirtelInternetProvider=new ExtremeAirtelInternetProvider("rahul", "aly");
        boolean ref7=extremeAirtelInternetProvider.equals(extremeAirtelInternetProvider);
        System.out.println(ref7);
        System.out.println(extremeAirtelInternetProvider.toString());
        extremeAirtelInternetProvider.service();
        
        System.out.println("++++++++++");
        
        Fast5gExtreme fast5gExtreme=new Fast5gExtreme("krana", "arjun");
        boolean ref8=fast5gExtreme.equals(fast5gExtreme);
        System.out.println(ref8);
        System.out.println(fast5gExtreme.toString());
        fast5gExtreme.service();
        
        System.out.println("++++++++++++");
        JioInternetProvider jioInternetProvider=new JioInternetProvider("nia", "bharti");
        boolean ref9=jioInternetProvider.equals(airtelInternetProvider);
        System.out.println(ref9);
        System.out.println(jioInternetProvider.toString());
        jioInternetProvider.service();
        
        System.out.println("++++++++++++++");
        
        SatjioInternetProvider satjioInternetProvider=new SatjioInternetProvider("ankita", "vicky", 56," 12/05/2024");
        boolean ref0=satjioInternetProvider.equals(jioInternetProvider);
        System.out.println(ref0);
        System.out.println(satjioInternetProvider.toString());
        satjioInternetProvider.service();
	}
	

}
