package com.github.fabriciolfj.javacodeproblems.patterns.abstractstrategy;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter<T> {


    public static <T> List<T> process(final List<T> list, final Predicate<T> predicate) {
        return list.stream().filter(t -> predicate.test(t))
                .collect(Collectors.toList());
    }
}
