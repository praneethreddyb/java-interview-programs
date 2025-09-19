package com.programs.completable;

import java.util.concurrent.*;

public class ExecutableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("This is an executable Java class.");
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        //        executorService.submit(() -> System.out.println("Task executed in thread: " + Thread.currentThread().getName()));
        //        executorService.shutdown();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Callable<String> res = () -> "Hello World from Callable: " + Thread.currentThread().getName();
            Future<String> response = executorService.submit(res);
            System.out.println(response.get());

        }
        executorService.shutdown();
        System.out.println("ExecutorService shut down.");
    }
}
