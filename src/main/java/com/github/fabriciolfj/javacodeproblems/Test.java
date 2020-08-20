package com.github.fabriciolfj.javacodeproblems;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
        var valor = new BigDecimal("80.0").setScale(2);

        System.out.println(valor);
    }
}
