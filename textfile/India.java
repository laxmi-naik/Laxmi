package com.xworks.textfile;


import java.io.FileReader;
import java.io.IOException;

public class India {
    public static void main(String[] args) {
    
    


        try (FileReader br = new FileReader("C:\\Users\\cw\\eclipse-workspace\\textfile\\src\\com\\xworks\\textfile\\india.text")) {
            int line;
            while ((line = br.read()) != -1) {
               
                System.out.print((char)line);
            }
        } catch (IOException e) {
        	System.out.println("io exception e");
        }
    }
}

