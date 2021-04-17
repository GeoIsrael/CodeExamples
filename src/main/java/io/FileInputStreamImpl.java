package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamImpl {

    public static void main(String[] args) throws IOException {


        String fileName = "/home/g/Desktop/Java/Pets/WoodClientBot/program";

        try (FileInputStream fis = new FileInputStream(fileName)) {

            int i;

            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        System.out.println();
    }


    }


}
