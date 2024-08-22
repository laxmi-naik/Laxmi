package com.xworkz.runner;

import com.xworkz.data. MarketData;
import com.xworkz.store.MarketStore;

public class Market {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketStore Markets=new MarketStore();
		
		 MarketData Market1= new  MarketData("apmc market","rajajinagar");
		 MarketData Market2= new  MarketData("sunday market","chickpet");
		 MarketData Market3= new  MarketData("as market","chickpet");
		 MarketData Market4= new  MarketData("city market","jayachamaraja");
		 MarketData Market5= new  MarketData("russell market","shivajinagar");
		 Markets.show();
		 Markets.save(Market1);
		 Markets.save(Market2);
		 Markets.save(Market3);
		 Markets.save(Market4);
		 Markets.save(Market5);
		 Markets.show();
		
	}

	}


