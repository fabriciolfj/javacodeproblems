package com.github.fabriciolfj.javacodeproblems.features.sumMaxMin;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Apollo", 2000),
                new Melon("Horned", 1700));

        //somando os pesos dos melões
        int total = melons.stream().mapToInt(Melon::getWeight).sum();
        System.out.println(total);

        int max = melons.stream().mapToInt(Melon::getWeight)
                .max()
                .orElse(-1);
        System.out.println(max);

        int min = melons.stream().mapToInt(Melon::getWeight)
                .min()
                .orElse(-1);

        System.out.println(min);
    }
}
