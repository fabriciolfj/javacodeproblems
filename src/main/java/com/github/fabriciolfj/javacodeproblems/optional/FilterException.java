package com.github.fabriciolfj.javacodeproblems.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterException {

    public static void main(String[] args) {
        List<Integer> dados = Arrays.asList(1,2,3,4);

        var dado = dados.stream()
                .filter(n -> Integer.valueOf(String.valueOf(n)).equals(5))
                .map(n -> Integer.valueOf(String.valueOf(n)) + 2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Valor não localizado"));

        System.out.println(dado);
    }
}
