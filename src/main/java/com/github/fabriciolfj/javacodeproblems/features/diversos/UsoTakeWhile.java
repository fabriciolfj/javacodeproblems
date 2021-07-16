package com.github.fabriciolfj.javacodeproblems.features.diversos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UsoTakeWhile {

    public static void main(String[] args) {
        List<Integer> result =
                IntStream.iterate(1, i-> i + 1) // vai gerar um infinito flux
                        .takeWhile(i -> i <= 10) // coloco um limite, mediante uma condição, ou seja, ele pega os elementos até essa condição
                        .boxed() //retorna um fluxo que consiste nos elementos desse fluxo
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
