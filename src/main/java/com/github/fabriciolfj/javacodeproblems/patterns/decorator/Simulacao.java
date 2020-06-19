package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

public class Simulacao {

    public static void main(String[] args) {
        /*Cake cake = new Nuts(new Creme(new BaseCake()));
        System.out.println(cake.decorate());*/

        CakeDecorator nutsAndCream = new CakeDecorator((Cake c) -> c.decorate(" with nuts"), (Cake c) -> c.decorate(" with cream"));
        Cake cake = nutsAndCream.decorate(new Cake("Base cake"));
        System.out.println(cake.getDecorations());
    }
}
