package core.multithreading;

import java.util.concurrent.*;

public class SubmitImpl {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        Future<Integer> future = executor.submit(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        });

        while (!future.isDone()) {
            System.out.println("no");
            TimeUnit.SECONDS.sleep(1);
        }

            Integer i = future.get(1, TimeUnit.SECONDS);
            System.out.println(i);
            executor.shutdown();




    }


}
