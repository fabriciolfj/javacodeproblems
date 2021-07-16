package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
* Executa um procedimento e não retorna nada
* */

public class MainRunAsync {

    private static Logger logger = LoggerFactory.getLogger(MainRunAsync.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MainRunAsync.printOrder();
    }

    public static void printOrder() throws ExecutionException, InterruptedException {
        CompletableFuture<Void> cfPrintOrder = CompletableFuture.runAsync(() -> {
            logger.info("Order is printed by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        cfPrintOrder.get();
        logger.info("Customer order was printed...");
    }
}
