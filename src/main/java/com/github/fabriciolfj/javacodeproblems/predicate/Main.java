package com.github.fabriciolfj.javacodeproblems.predicate;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    private static List<Melon> melons = Arrays.asList(
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
            new Melon("Apollo", 2000),
            new Melon("Horned", 1700));

    public static void main(String[] args) {
        Predicate<Melon> p2000Apollo = m -> m.getWeight() > 2000;
        Predicate<Melon> p2000GacApollo = p2000Apollo.and(m -> m.getType().equals("Gac")).or(m -> m.getType().equals("Apollo"));

        List<Melon> result = melons.stream().filter(p2000GacApollo).collect(Collectors.toList());

        System.out.println(result);

        Predicate<Melon> pNot2000 = Predicate.not(m -> m.getWeight() > 2000);

        List<Melon> result2 = melons.stream().filter(pNot2000).collect(Collectors.toList());
        System.out.println(result2);
    }

}
