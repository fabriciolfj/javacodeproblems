package com.github.fabriciolfj.javacodeproblems.patterns.factory;

import com.github.fabriciolfj.javacodeproblems.model.Gac;
import com.github.fabriciolfj.javacodeproblems.model.Melon;


public class Simulacao {

    public static void main(String[] args) {
        Gac gac = (Gac) MelonFactory.newInstance(Gac.class);
        Melon melon = (Melon) MelonFactory.newInstance("Gac", 2000, "red");

        System.out.println(gac);
        System.out.println(melon);
    }
}
