package brainway;

import brainway.LimitedHashMap;

public class LimitedMapController {


    public static void main(String[] args) throws InterruptedException {
        LimitedHashMap map = new LimitedHashMap();
        map.putItem("a", "1");
        map.putItem("b", "2");
        map.putItem("c", "3");
        map.putItem("d", "4");
        map.putItem("e", "5");
        map.putItem("g", "6");
        map.printMap();
    }//



}
