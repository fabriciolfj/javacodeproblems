package com.github.fabriciolfj.javacodeproblems.funcaocomposta;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Double, Double> f = x -> x * 2;
        Function<Double, Double> g = x -> Math.pow(x,2);
        Function<Double, Double> gf = f.andThen(g); // pega o resultado da funcao f e aplica a função g
        Function<Double, Double> gfv2 = f.compose(g); // pego o resultado g, com base no valor passado no apply, e aplico a função f

        System.out.println(gf.apply(4d));
        System.out.println(gfv2.apply(4d));
    }
}
