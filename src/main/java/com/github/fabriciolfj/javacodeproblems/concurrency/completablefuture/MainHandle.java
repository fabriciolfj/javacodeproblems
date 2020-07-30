package com.github.fabriciolfj.javacodeproblems.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Executa dando ou não uma exceção, retornando um bifunction
 *
 */
public class MainHandle {

    private static Logger log = LoggerFactory.getLogger(MainHandle.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> totalOrder = CompletableFuture.supplyAsync(() -> {
            log.info("Compute total by: " + Thread.currentThread().getName());
            int random = new Random().nextInt(1000);

            if(random < 500) {
                throw new IllegalStateException("Computing service is not responding");
            }

            return  1000;
        }).handle((res, ex) -> {
            if(ex != null) {
                log.error("Exception: " + ex + ", " + Thread.currentThread().getName());
                return 0;
            }

            return res * 2;
        });//.completeExceptionally(new RuntimeException(()));

        Integer result = totalOrder.get();
        log.info(String.valueOf(result));
    }
}
