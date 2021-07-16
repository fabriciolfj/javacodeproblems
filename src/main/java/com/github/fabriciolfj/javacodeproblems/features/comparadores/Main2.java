package com.github.fabriciolfj.javacodeproblems.features.comparadores;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toList;

public class Main2 {
    public static void main(String[] args) {
        var palavras = List.of("Maçã", "banana", "arroz", "banana", "maçã", "casa", "papagaio", "casa", "casa");

        var frequencia = palavras.stream().collect(Collectors.groupingBy(String::toLowerCase, counting()));
        var top3 = frequencia.keySet().stream().sorted(comparing(frequencia::get).reversed()).limit(4).collect(toList());

        System.out.println(top3);
    }
}
