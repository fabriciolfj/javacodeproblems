package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

import java.util.function.Function;

public class Simulacao {

    public static void main(String[] args) {
        /*Cake cake = new Nuts(new Creme(new BaseCake()));
        System.out.println(cake.decorate());*/

        CakeDecorator nutsAndCream = new CakeDecorator((Cake c) -> c.decorate(" with nuts"), (Cake c) -> c.decorate(" with cream"));
        Cake cake = nutsAndCream.decorate(new Cake("Base cake"));
        System.out.println(cake.getDecorations());

        Function<Cake, Cake> teste = (Cake c) -> c.decorate("teste1");
        Cake teste2 = new Cake("teste");
        Cake apply = teste.apply(teste2);
        System.out.println(apply.getDecorations());

        Function<String, Long> valor = (String s) -> Long.parseLong(s);
        Long result = valor.apply("55");
        System.out.println(result);
    }
}
