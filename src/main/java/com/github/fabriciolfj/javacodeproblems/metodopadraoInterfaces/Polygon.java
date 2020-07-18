package com.github.fabriciolfj.javacodeproblems.metodopadraoInterfaces;

import java.util.Arrays;

public interface Polygon {

    double area();

    default double perimeter(double...segments) {
        return Arrays.stream(segments)
                .sum();
    }
}
