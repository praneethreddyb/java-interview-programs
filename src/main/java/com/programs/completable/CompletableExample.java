package com.programs.completable;

import java.util.concurrent.CompletableFuture;

public class CompletableExample {

    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");

        CompletableFuture<Integer> transformedFuture = future.thenApplyAsync(s -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            return s.length();
        });

        transformedFuture.thenAccept(length -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
            System.out.println("Length of Hello: " + length);

            CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");

            CompletableFuture<String> future2 = future1.thenComposeAsync(s -> CompletableFuture.supplyAsync(() -> s + " World"));

            future2.thenAccept(System.out::println);
            CompletableFuture<String> s = CompletableFuture.supplyAsync(()->"Praneeth");
            CompletableFuture<String> finalResult = s.thenComposeAsync(s1->CompletableFuture.supplyAsync(() -> s1 + " Kumar"));
            finalResult.thenAcceptAsync(System.out::println);
        });
    }
}
