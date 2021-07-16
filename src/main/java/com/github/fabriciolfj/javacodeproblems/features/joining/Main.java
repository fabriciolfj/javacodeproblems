package com.github.fabriciolfj.javacodeproblems.features.joining;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    /*
    * quando quero gerar um novo fluxo, acrescentando um sufixo ou prefixo.
    * */
    private List<Melon> melons = Arrays.asList(
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
            new Melon("Apollo", 2000),
            new Melon("Horned", 1700));

    public static void main(String[] args) {
        new Main().process();
    }

    private void process() {
        String melonName = melons.stream().map(Melon::getType)
                .distinct()
                .sorted()
                .collect(Collectors.joining(" , "));

        System.out.println(melonName);
    }
}
