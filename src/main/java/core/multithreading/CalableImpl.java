package core.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class CalableImpl {

    public static void main(String[] args) throws Exception {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        System.out.println(task.call());


    }


}
