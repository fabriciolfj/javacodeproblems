package com.github.fabriciolfj.javacodeproblems.teen;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Mescla 2 collections
* */
public class Main {

    private List<Melon> melons = Arrays.asList(
            new Melon("Gac", 2000),
            new Melon("Hemi", 1600),
            new Melon("Gac", 3000),
            new Melon("Apollo", 2000),
            new Melon("Horned", 1700));

    public static void main(String[] args) {
        new Main().exemplo1();
        new Main().exemplo2();
        new Main().exemplo3();
    }

    public void exemplo1() {
        CountSum count = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(e -> e),
                        CountSum::new
                ));

        System.out.println(count);
    }

    public void exemplo2() {
        MaxMin maxMin = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.naturalOrder()),
                        Collectors.maxBy(Comparator.naturalOrder()),
                        (Optional<Integer> e1, Optional<Integer> e2) ->
                                new MaxMin(e1.orElse(Integer.MIN_VALUE), e2.orElse(Integer.MAX_VALUE))
                ));

        System.out.println(maxMin);
    }

    public void exemplo3() {
        WeightsAndTotal weightsAndTotal = melons.stream().collect(
                Collectors.teeing(
                        Collectors.summingInt(Melon::getWeight),
                        Collectors.mapping(m -> m.getWeight(), Collectors.toList()),
                        WeightsAndTotal::new
                )
        );

        System.out.println(weightsAndTotal);
    }
}

