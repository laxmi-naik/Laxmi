package com.xworks.textfile;

import java.io.FileWriter;
import java.io.IOException;

public class Person {
	public static void main(String[] args) {
        
        String filePath = "C:\\Users\\cw\\eclipse-workspace\\textfile\\src\\com\\xworks\\textfile\\Person_info.text";

        
        String name = "Laxmi Naik";
        String email = "laxmi@gmail.com";
        String mobile = "9844312496";

       
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Name: " + name + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Mobile: " + mobile + "\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
           System.out.println("io exception e");
        }
    }
}
