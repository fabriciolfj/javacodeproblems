package com.github.fabriciolfj.javacodeproblems.patterns.loanpattern;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.function.Function;

public class Formula {

    private final Scanner scanner;
    private double result;

    private Formula()  throws IOException {
        result = 0.0d;
        scanner = new Scanner(Path.of("doubles.txt"), StandardCharsets.UTF_8);
    }

    public static double compute(Function<Formula, Double> f) throws IOException {
        Formula formula = new Formula();
        double result = 0.0d;

        result = f.apply(formula);
        return result;
    }

    public Formula add() {
        if (scanner.hasNext()) {
            result += Double.parseDouble(scanner.next());
        }

        return this;
    }

    public Formula minus() {
        if (scanner.hasNext()) {
            result -= Double.parseDouble(scanner.next());
        }

        return this;
    }

    public Formula multiplyWithSqrt() {
        if (scanner.hasNext()) {
            result *= Math.sqrt(Double.parseDouble(scanner.next()));
        }

        return this;
    }

    private void close() {
        try (scanner) {
            result = 0.0d;
        }
    }

    public Double result() {
        return  result;
    }

}
