package com.github.fabriciolfj.javacodeproblems.features.sumarizingInt;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Simulacao {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Apollo", 2000),
                new Melon("Horned", 1700));

        IntSummaryStatistics statistics = melons.stream().collect(Collectors.summarizingInt(Melon::getWeight));

        System.out.println(statistics);
        System.out.println("Max: " + statistics.getMax());
    }
}