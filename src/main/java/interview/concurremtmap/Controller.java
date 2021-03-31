package interview.concurremtmap;

public class Controller {

    public static void main(String[] args) {

        ConcurrentMapCache concurrentMapCache = new ConcurrentMapCache();

        concurrentMapCache.put(2,3);
        System.out.println(concurrentMapCache.getNativeCache());



    }
}
