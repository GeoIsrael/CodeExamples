package io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SequenceInputStreamImpl {

    public static void main(String[] args) throws IOException {

        String initialString1 = "000";
        String initialString2 = "000";
        String initialString3 = "444";
        InputStream input1 = new ByteArrayInputStream(initialString1.getBytes());
        InputStream input2 = new ByteArrayInputStream(initialString2.getBytes());
        InputStream input3 = new ByteArrayInputStream(initialString3.getBytes());



        List<InputStream> streams = new ArrayList<>();
        streams.add(input1);
        streams.add(input2);
        streams.add(input3);

        SequenceInputStream sequenceInputStream =
                new SequenceInputStream(Collections.enumeration(streams));


        int data = sequenceInputStream.read();
        while(data != -1){
            System.out.println(Character.getNumericValue(data));
            data = sequenceInputStream.read();
        }
        sequenceInputStream.close();




    }


}
