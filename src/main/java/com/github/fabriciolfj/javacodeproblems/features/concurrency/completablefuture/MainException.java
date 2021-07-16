package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainException {

    private static Logger logger = LoggerFactory.getLogger(MainException.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       // fetchOrderTotalException();
        fetchOrderTotalExceptionAsync();
    }

    private static void fetchOrderTotalException() throws ExecutionException, InterruptedException {
        CompletableFuture<String> cfTotalOrder =
                CompletableFuture.supplyAsync(() -> {
                    logger.info("Compute total: " + Thread.currentThread().getName());

                    int surrogate = new Random().nextInt(1000);

                    if(surrogate <  500) {
                        throw new IllegalStateException("Invoice service is not responding");
                    }

                    return  "Total: " + surrogate;
                }).thenApply(o -> {
                    o = o + " , Sign invoice by: " + Thread.currentThread().getName();
                    return o;
                }).exceptionally(ex -> {
                    logger.error("Exception: " + ex + " " + Thread.currentThread().getName());
                    return "Exception";
                });

        String result = cfTotalOrder.get();
        logger.info(result);
    }

    private static void fetchOrderTotalExceptionAsync() throws ExecutionException, InterruptedException {
        CompletableFuture<String> cfTotalOrder =
                CompletableFuture.supplyAsync(() -> {
                    logger.info("Compute total: " + Thread.currentThread().getName());

                    int surrogate = new Random().nextInt(1000);

                    if(surrogate <  500) {
                        throw new IllegalStateException("Invoice service is not responding");
                    }

                    return  "Total: " + surrogate;
                }).thenApply(o -> {
                    o = o + " , Sign invoice by: " + Thread.currentThread().getName();
                    return o;
                }).exceptionallyAsync(ex -> {
                    logger.error("Exception: " + ex + " " + Thread.currentThread().getName());
                    return "Exception";
                });

        String result = cfTotalOrder.get();
        logger.info(result);
    }
}
