package com.github.fabriciolfj.javacodeproblems.comparadores;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
* Uso de comparadores compostos
* */
public class Main {

    private static List<Melon> melons = Arrays.asList(
            new Melon("D", 2000),
            new Melon("A", 1600),
            new Melon("C", 3000),
            new Melon("B", 2000),
            new Melon("G", 1600),
            new Melon("F", 1600));

    public static void main(String[] args) {
        ordenarPorTipoAquelesQueTiveremOMesmoPeso();
    }

    private static void ordenarPorTipoAquelesQueTiveremOMesmoPeso() {
        Comparator<Melon> pesoTipo = Comparator.comparing(Melon::getWeight).thenComparing(Melon::getType, String.CASE_INSENSITIVE_ORDER);
        var result = melons.stream().sorted(pesoTipo).collect(Collectors.toList());
        System.out.println(result);
    }
}
