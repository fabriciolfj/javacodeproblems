package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

public class SimulacaoAntiga {

    public static void main(String[] args) {
        Cake cake = new Nuts(new Creme(new BaseCake()));
        System.out.println(cake.decorate());
    }
}
