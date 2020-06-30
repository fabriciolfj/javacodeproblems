package com.github.fabriciolfj.javacodeproblems.agrupando;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Simulacao {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000),
                new Melon("teste", 2000),
                new Melon("teste", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Apollo", 2000),
                new Melon("Horned", 1700));

        var melonsGroup = melons.stream().collect(Collectors.groupingBy(Melon::getWeight));
        System.out.println(melonsGroup);

        var semDuplicidade = melons.stream().collect(Collectors.groupingBy(Melon::getWeight, Collectors.toSet()));
        System.out.println(semDuplicidade);

        //convertendo em uma lista de string
        Map<Integer, Set<String>> byWeightInSetOrdered = melons.stream()
                .collect(Collectors.groupingBy(Melon::getWeight, TreeMap::new, Collectors.mapping(Melon::getType, Collectors.toSet())));
        System.out.println(byWeightInSetOrdered);

        //agrupar por tipo e contar
        Map<String, Long> typesCount = melons.stream()
                .collect(Collectors.groupingBy(Melon::getType, Collectors.counting()));
        System.out.println(typesCount);

        //agrupando por tipo, os melons mais pesados
        Map<String, Optional<Melon>> maxMelonType = melons.stream().collect(Collectors.groupingBy(Melon::getType
                , Collectors.maxBy(Comparator.comparingInt(Melon::getWeight))));
        System.out.println(maxMelonType);

        //agrupando por tipo, os melons mais leves
        Map<String, Optional<Melon>> minMelonType = melons.stream().collect(Collectors.groupingBy(Melon::getType
                , Collectors.minBy(Comparator.comparingInt(Melon::getWeight))));
        System.out.println(minMelonType);

        //agrupando por tipo e melons mais leves, de outra forma
        Map<String, Integer> minMelonTypeOutraForma = melons.stream()
                .collect(Collectors.groupingBy(Melon::getType, Collectors.collectingAndThen(
                        Collectors.minBy(Comparator.comparingInt(Melon::getWeight)),
                        m -> m.orElseThrow().getWeight()
                )));
        System.out.println(minMelonTypeOutraForma);

    }
}