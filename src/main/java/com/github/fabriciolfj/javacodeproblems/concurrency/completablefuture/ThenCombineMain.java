package com.github.fabriciolfj.javacodeproblems.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * combina 2 ou mais completable future
 */
public class ThenCombineMain {

    private static Logger logger = LoggerFactory.getLogger(ThenCombineMain.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cfTotal = CompletableFuture.supplyAsync(() -> new Random().nextInt(1000));
        CompletableFuture<String> customer = CompletableFuture.supplyAsync(() -> "Order customer");

        String result = customer.thenCombine((cfTotal), (c, t) -> c + ", Total: " + t).get();
        logger.info(result);
    }
}
