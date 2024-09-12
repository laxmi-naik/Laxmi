package com.xworks.textfile;
import java.time.LocalDate;
public class pastDate {
	
	    public static void main(String[] args) {
	        //  20 days ago
	        LocalDate pastDate = LocalDate.now().minusDays(20);
	        System.out.println("Past Date: " + pastDate);
	    }
	}

