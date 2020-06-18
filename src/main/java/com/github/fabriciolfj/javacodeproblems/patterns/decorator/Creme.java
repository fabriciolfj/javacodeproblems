package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

public class Creme extends CakeDecorator {
    public Creme(Cake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithNuts();
    }

    private String decorateWithNuts() {
        return "creme ";
    }
}
