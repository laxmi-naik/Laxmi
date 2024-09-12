package com.xworks.textfile;

import java.time.LocalDateTime;

public class pastDateTime {
	public static void main(String[] args) {
        // Create a datetime  5 days ago 
        LocalDateTime pastDateTime = LocalDateTime.now().minusDays(10);
        System.out.println("Past DateTime: " + pastDateTime);
    }
}

