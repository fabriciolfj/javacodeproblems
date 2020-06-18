package com.github.fabriciolfj.javacodeproblems.patterns.strategy;

@FunctionalInterface
public interface RemoveStrategy {
    String execute(String s);
}
