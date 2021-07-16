package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
 * Pega o retorno e um outro completable future e executa outro completable future, retornando void (similar ao thenAccepty, mas executa um runnable)
 * */
public class MainThenRun {

    private static Logger logger = LoggerFactory.getLogger(MainThenRun.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        fetchInvoiceTotalSign();
    }

    private static void fetchInvoiceTotalSign() throws ExecutionException, InterruptedException {
        CompletableFuture<String> cfFetchInvoice = CompletableFuture.supplyAsync(() -> {
            logger.info("Fetch invoice by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "Invoice #3344";
        });

        CompletableFuture<Void> result = cfFetchInvoice
                .thenApply(o -> o + "Total: $145 ")
                .thenRun(() -> logger.info("Signed " + Thread.currentThread().getName()));

        result.get();

    }
}
