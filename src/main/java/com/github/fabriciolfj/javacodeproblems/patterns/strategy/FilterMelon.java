package com.github.fabriciolfj.javacodeproblems.patterns.strategy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMelon {

    private final List<Melon> melons;

    public FilterMelon(List<Melon> melons) {
        this.melons = melons;
    }

    public List<Melon> process(final MelonPredicate predicate) {
        return melons.stream().filter(m -> predicate.test(m))
                .collect(Collectors.toList());
    }
}
