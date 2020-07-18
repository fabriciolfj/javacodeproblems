package com.github.fabriciolfj.javacodeproblems.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random rdn = new Random();
        List<Double> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            numbers.add(rdn.nextDouble());
        }

        ForkJoinPool custom = new ForkJoinPool(5);
        double result = custom.submit(() -> numbers.parallelStream().reduce((a1, a2) -> a1 + a2)).get().orElse(-1d);
        System.out.println(result);
    }
}
