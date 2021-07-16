package com.github.fabriciolfj.javacodeproblems.features.matching;

import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<String> melons = Arrays.asList("Gac", "Cantaloupe", "Hemi", "Gac", "Gac", "Hemi", "Cantaloupe", "Horned", "Hemi", "Hemi");

        //ao menos o elemento Gac está na lista
        boolean isAnyGac = melons.stream().anyMatch(m -> m.equals("Gac"));
        System.out.println(isAnyGac);

        boolean isAnyApolo = melons.stream().anyMatch(m -> m.equals("Apollo"));
        System.out.println(isAnyApolo);

        //nenhum elemento Gac está na lista
        boolean isNoneGac = melons.stream().noneMatch(m -> m.equals("Gac"));
        System.out.println(isNoneGac);

        boolean isNoneApolo = melons.stream().noneMatch(m -> m.equals("Apollo"));
        System.out.println(isNoneApolo);

        //todos os elementos combinam com Gac
        boolean areAllGac = melons.stream().allMatch(m -> m.equals("Gac"));
        System.out.println(areAllGac);

        //todos os elementos são maiores que 2
        boolean areAllLargeThan2 = melons.stream().allMatch(m -> m.length() > 2);
        System.out.println(areAllLargeThan2);

    }
}
