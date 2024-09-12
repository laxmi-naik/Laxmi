package com.xworks.textfile;

import java.time.LocalDateTime;

public class futureDateTime {
	public static void main(String[] args) {
        
        LocalDateTime futureDateTime = LocalDateTime.now().plusDays(10);
        System.out.println("Future Date Time : " + futureDateTime);
    }
}
