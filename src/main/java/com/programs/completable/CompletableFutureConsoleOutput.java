package com.programs.completable;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureConsoleOutput {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            return "Hello from CompletableFuture!";
        });
        future.thenAcceptAsync(result -> {
            System.out.println("Output from thenAcceptAsync: " + result);
        });

        // Keep the main thread alive for a moment to allow the async task to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}