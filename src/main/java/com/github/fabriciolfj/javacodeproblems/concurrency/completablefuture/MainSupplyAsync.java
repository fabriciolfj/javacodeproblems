package com.github.fabriciolfj.javacodeproblems.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
* Retorna um resultado
* */
public class MainSupplyAsync {

    private static Logger logger = LoggerFactory.getLogger(MainSupplyAsync.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        fetchOrderSummary();
    }

    private static void fetchOrderSummary() throws ExecutionException, InterruptedException {
        CompletableFuture<String> cfOrderSummary = CompletableFuture.supplyAsync(() -> {
            logger.info("Fetch order summary by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Order Summart #93443";
        });

        String summary = cfOrderSummary.get();
        logger.info("Return: " + summary);
    }
}
