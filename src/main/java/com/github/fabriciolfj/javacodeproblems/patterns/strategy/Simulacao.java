package com.github.fabriciolfj.javacodeproblems.patterns.strategy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.List;

public class Simulacao {

    public static void main(String[] args) {
        Melon m1 = new Melon("gac", 1000, "br");
        Melon m2 = new Melon("tec", 1000, "br");
        Melon m3 = new Melon("gac", 5000, "br");
        Melon m4 = new Melon("tec", 1000, "br");
        Melon m5 = new Melon("gac", 6000, "br");
        Melon m6 = new Melon("gac", 12000, "br");

        List<Melon> melons = Arrays.asList(m1, m2, m3, m4, m5, m6);
        FilterMelon filter = new FilterMelon(melons);
        List<Melon> gacs = filter.process(new GacMelonPredicate());
        List<Melon> huges = filter.process(new HugeMelonPredicate());

        System.out.println("Total gacs: " + gacs.size());
        System.out.println("Total huge: " + huges.size());

    }
}
