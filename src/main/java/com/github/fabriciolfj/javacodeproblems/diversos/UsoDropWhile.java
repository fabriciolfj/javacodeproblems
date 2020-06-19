package com.github.fabriciolfj.javacodeproblems.diversos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsoDropWhile {

    public static void main(String[] args) {
        List<Integer> result =
                IntStream.iterate(1, i-> i + 1) // vai gerar um infinito flux
                        .dropWhile(i -> i <= 10)
                        .limit(10)// vai pegar todos que não atendem a essa condição
                        .boxed() //retorna um fluxo que consiste nos elementos desse fluxo
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
