package com.github.fabriciolfj.javacodeproblems.features.filteringFlatMapmappingMapping;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainFlatMapping {

    private List<Melon> melons = Arrays.asList(
            new Melon("HoneyDew", Arrays.asList("Spider", "Melon Aphids", "Squash Bugs")),
            new Melon("Crenshaw", Arrays.asList("Pickeleworms")),
            new Melon("Gac", Arrays.asList("Squash bugs", "Squash Vine Borers"))
    );

    public static void main(String[] args) {
        new MainFlatMapping().queroPegarAListaDePragaDeCadaMelao();
    }

    public void queroPegarAListaDePragaDeCadaMelao() {
        Map<String, Set<String>> pragas =
                melons.stream().collect(
                        Collectors.groupingBy(Melon::getType, Collectors.flatMapping(m -> m.getBugs().stream(), Collectors.toSet()))
                );

        System.out.println(pragas);
    }
}
