package com.github.fabriciolfj.javacodeproblems.patterns.strategy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

public class GacMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return "gac".equalsIgnoreCase(melon.getType());
    }
}
