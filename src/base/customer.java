package base;

import java.util.concurrent.*;

public class customer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Future<?> submit = pool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("run ...");
            }
        });
        for (int i = 0; i < 100; i++) {
            Object o = submit.get();
            System.out.println("i" + i + o);
        }
    }
}
