package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
* Caso o completable de alguma exceção, execute este outro
* */
public class ExceptionallyCompose {

    private static Logger log = LoggerFactory.getLogger(ExceptionallyCompose.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> cfServicePrinterIp = CompletableFuture.supplyAsync(() -> {
            int random = new Random().nextInt(1000);

            if(random < 500) {
                throw new IllegalStateException("Printing service is not responding");
            }

            return "192.168.1.0";
        });

        CompletableFuture<String> backup = CompletableFuture.supplyAsync(() -> "192.168.2.0");

        CompletableFuture<Void> result = cfServicePrinterIp.exceptionallyComposeAsync(b -> {
            log.info("Exception: " + b + ", " + Thread.currentThread().getName());
            return backup;
        }).thenAccept(p -> log.info(p));


        result.get();
    }
}
