package core.date;

import java.time.Clock;
import java.time.ZoneId;

public class ZoneImpl {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        Clock clock = Clock.system(zoneId);

        System.out.println(clock.getZone().getId());



    }


}
