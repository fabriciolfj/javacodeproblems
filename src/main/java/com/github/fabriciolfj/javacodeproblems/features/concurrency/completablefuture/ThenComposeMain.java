package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Compoe 2 ou mais completable future
 */
public class ThenComposeMain {

    private static Logger logger = LoggerFactory.getLogger(ThenComposeMain.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> cfTotal = CompletableFuture.supplyAsync(() -> new Random().nextInt(1000));
        CompletableFuture<String> customer = CompletableFuture.supplyAsync(() -> "Order customer");

        Integer result = customer.thenCompose(o -> cfTotal).get();
        logger.info(String.valueOf(result));
    }
}
