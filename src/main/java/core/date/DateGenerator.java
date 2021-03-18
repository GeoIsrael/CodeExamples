package core.date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class DateGenerator {
    public static void main(String[] args) {


        Instant i1 = Instant.parse("2017-02-03T11:35:30.00Z");
        Instant i2 = Instant.now();

        Instant later   = i2.plusSeconds(3);
        Instant earlier = i2.minusSeconds(3);



        Instant instant1 = Instant.now();
        System.out.println("Instant1: " + instant1);

        Instant instant2 = Instant.now(Clock.systemUTC());
        System.out.println("Instant2: " + instant2);

        long now = System.currentTimeMillis();
        Instant instant3 = Instant.ofEpochMilli(now);
        System.out.println("Instant3: " + instant3);

        now = now/1000;
        Instant instant4 = Instant.ofEpochSecond(now);
        System.out.println("Instant4: " + instant4);

        Instant instant5 = Instant.ofEpochSecond(now, 345000000);
        System.out.println("Instant5: " + instant5);

        Instant instant6 = Instant.parse("1980-04-09T10:15:30.00Z");
        System.out.println("Instant6: " + instant6);


        //------------------------------
        long noww = System.currentTimeMillis();
        Date date = new Date(noww);
        Instant instant = date.toInstant();
        System.out.println("instant: " + instant);


        Instant instant0 = Instant.now();
        System.out.println("Instant    : " + instant0);

        long epochSecond = instant0.getEpochSecond();
        System.out.println("EpochSecond: " + epochSecond);

        int nano = instant0.getNano();
        System.out.println("Nano       : " + nano);




    }



    public static Instant between(Instant startInclusive, Instant endExclusive) {
        long startSeconds = startInclusive.getEpochSecond();
        long endSeconds = endExclusive.getEpochSecond();
        long random = ThreadLocalRandom
                .current()
                .nextLong(startSeconds, endSeconds);

        return Instant.ofEpochSecond(random);
    }



}
