package com.xworks.textfile;

import java.time.LocalDate;

public class futureDate {

    public static void main(String[] args) {
        //  20 days 
        LocalDate futureDate = LocalDate.now().plusDays(20);
        System.out.println("future Date : " + futureDate);
    }
}

