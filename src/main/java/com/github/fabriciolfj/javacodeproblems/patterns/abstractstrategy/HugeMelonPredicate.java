package com.github.fabriciolfj.javacodeproblems.patterns.abstractstrategy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

public class HugeMelonPredicate implements MelonPredicate {
    @Override
    public boolean test(Melon melon) {
        return melon.getWeight() >  5000;
    }
}
