package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

public class GzipOutputStreamImpl {

    public static void main(String[] args) throws IOException {

        String data = "This is a text inside the file.";

        FileOutputStream outputStream     = new FileOutputStream("/home/g/Desktop/Java/myfile.zip");
        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(outputStream);


//        byte[] data = ... ; // get data from somewhere.

        gzipOutputStream.write(data.getBytes(StandardCharsets.UTF_8));


    }


}
