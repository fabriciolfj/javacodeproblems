package com.github.fabriciolfj.javacodeproblems.patterns.abstractstrategy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

public interface MelonPredicate {

    boolean test(Melon melon);
}
