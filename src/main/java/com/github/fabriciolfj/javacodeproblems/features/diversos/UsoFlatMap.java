package com.github.fabriciolfj.javacodeproblems.features.diversos;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsoFlatMap {

    public static void main(String[] args) {
        Melon[][] melons = {
                {new Melon("teste1", 0, (Melon.Sugar) null), new Melon("teste11", 0, (Melon.Sugar) null)},
                {new Melon("teste2", 0, (Melon.Sugar) null), new Melon("teste22", 0, (Melon.Sugar) null)},
                {new Melon("teste2", 0, (Melon.Sugar) null), new Melon("teste33", 0, (Melon.Sugar) null)}};

        var result = Stream.of(melons)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
