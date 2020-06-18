package com.github.fabriciolfj.javacodeproblems.patterns.templateMethodPattern;

public class Simulacao {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        new PizzaLambda().make(pizza, (Pizza p) -> System.out.println("Add: bits of tomato, onion, onchovies, and herbs"));
    }
}
