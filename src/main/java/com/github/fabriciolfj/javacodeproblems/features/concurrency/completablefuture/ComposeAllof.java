package com.github.fabriciolfj.javacodeproblems.features.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
* Executa todos os completable futurec
* */
public class ComposeAllof {

    private static Logger logger = LoggerFactory.getLogger(ComposeAllof.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var names = Arrays.asList("Fabricio", "Suzana");

        CompletableFuture<String>[] cfs = names.stream()
                .map(ComposeAllof::cfNome)
                .toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(cfs).get();
    }

    private static CompletableFuture<Void> cfNome(String nome) {
        return CompletableFuture.runAsync(() -> logger.info("Add: " + nome));
    }
}
