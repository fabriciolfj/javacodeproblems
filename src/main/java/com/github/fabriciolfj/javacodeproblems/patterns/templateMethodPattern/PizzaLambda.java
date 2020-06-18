package com.github.fabriciolfj.javacodeproblems.patterns.templateMethodPattern;

import java.util.function.Consumer;

public class PizzaLambda {

    public void make(Pizza pizza, Consumer<Pizza> addTopIngredients) {
        makeDough(pizza);
        addTopIngredients.accept(pizza);
        bake(pizza);
    }

    private void makeDough(Pizza pizza) {
        System.out.println("Make dough");
    }

    private void bake(Pizza pizza) {
        System.out.println("Bake the pizza");
    }
}
