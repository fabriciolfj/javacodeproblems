package com.github.fabriciolfj.javacodeproblems.patterns.abstractstrategy;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

public class GacMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
