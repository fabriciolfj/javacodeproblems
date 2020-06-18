package com.github.fabriciolfj.javacodeproblems.patterns.strategy;

public class Simulacao {

    public static void main(String[] args) {
        String noNr = Remover.remove("texto2", s -> s.replaceAll("\\d", ""));
        String noWs = Remover.remove("texto2", s -> s.replaceAll("\\s", ""));

        System.out.println(noNr);
        System.out.println(noWs);
    }
}