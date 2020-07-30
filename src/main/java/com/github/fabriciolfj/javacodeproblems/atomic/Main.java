package com.github.fabriciolfj.javacodeproblems.atomic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AtomicIncrementador incrementador = new AtomicIncrementador();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 1_000_000; i++) {
            executorService.execute(incrementador);
        }

        Thread.sleep(1000);

        System.out.println(incrementador.getCount());
    }
}
