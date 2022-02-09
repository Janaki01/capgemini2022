package com.demo.Day9;
import java.io.FileOutputStream;

public class FileInputDemo {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("Output123.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
 