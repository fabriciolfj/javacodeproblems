package com.github.fabriciolfj.javacodeproblems.summing;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Apollo", 2000),
                new Melon("Horned", 1700));

        //somando os pesos dos melões
        int total = melons.stream().collect(Collectors.summingInt(Melon::getWeight));
        System.out.println(total);

        double somandoKilogramas = melons.stream().collect(Collectors.reducing(0, m -> m.getWeight(), (m1, m2) -> m1 + m2)) / 1000.0d;
        System.out.println(somandoKilogramas);
    }
}
