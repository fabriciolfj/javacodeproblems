package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

public class BaseCake implements Cake {

    @Override
    public String decorate() {
        return "Base cake ";
    }
}
