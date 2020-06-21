package com.github.fabriciolfj.javacodeproblems.reduce;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.List;

public class Main {

    private List<Melon> melons = Arrays.asList(
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
            new Melon("Apollo", 2000),
            new Melon("Horned", 1700));


    public static void main(String[] args) {
        new Main().somar();
        new Main().min();
        new Main().max();
        new Main().calculo();
    }

    private void somar() {
        int total = melons.stream().map(Melon::getWeight)
                .reduce(0, (m1, m2) -> m1 + m2);

        System.out.println(total);
    }

    private void max() {
        int max = melons.stream().map(Melon::getWeight)
                .reduce(Integer::max).orElse(-1);

        System.out.println(max);

    }

    private void min() {
        int min = melons.stream().map(Melon::getWeight)
                .reduce(Integer::min)
                .orElse(-1);

        System.out.println(min);
    }

    private void calculo() {
        List<Double> numbers = Arrays.asList(1.0d, 5.0d, 8.0d, 10.0d);
        double hm = numbers.size() / numbers.stream()
                .mapToDouble(x -> 1.0d / x)
                .reduce((x1, x2) -> (x1 + x2))
                .orElseThrow();

        System.out.print(hm);
    }
}
