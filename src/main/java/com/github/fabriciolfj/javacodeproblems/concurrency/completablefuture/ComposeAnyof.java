package com.github.fabriciolfj.javacodeproblems.concurrency.completablefuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/*
* Retorna quando um dos completable future conclui e encerra o restante.
* */
public class ComposeAnyof {

    private static Logger logger = LoggerFactory.getLogger(ComposeAnyof.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var names = Arrays.asList("Fabricio", "Suzana", "teste1", "teste2", "teste3");

        CompletableFuture<String>[] cfs = names.stream()
                .map(ComposeAnyof::cfNome)
                .toArray(CompletableFuture[]::new);

        CompletableFuture<Object> winner = CompletableFuture.anyOf(cfs);
        Object result = winner.get();
        logger.info("Retornado: " + result);
    }

    private static CompletableFuture<String> cfNome(String nome) {
        return CompletableFuture.supplyAsync(() -> nome);
    }
}
