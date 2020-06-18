package com.github.fabriciolfj.javacodeproblems.patterns.loanpattern;

import java.io.IOException;
import java.util.function.Function;

public class Simulacao {

    public static void main(String[] args) throws IOException {
        double xPluxYMinusZ = Formula.compute((sc) -> sc.add().minus().multiplyWithSqrt().result());
        System.out.println(xPluxYMinusZ);

        Function<Long, String> t = s -> Long.valueOf(100 * s).toString();
        System.out.println(t.apply(10L));
    }
}
