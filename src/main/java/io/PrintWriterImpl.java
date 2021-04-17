package io;


import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterImpl {
    public static void main(String[] args) throws IOException {


        String data = "This is a text inside the file.";

        try {
            PrintWriter output = new PrintWriter("/home/g/Desktop/Java/output.txt");

            output.print(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }







}
