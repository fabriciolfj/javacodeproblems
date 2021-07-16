package com.github.fabriciolfj.javacodeproblems.features.metodopadraoInterfaces;

import java.util.Arrays;

public interface Polygon {

    double area();

    default double perimeter(double...segments) {
        return Arrays.stream(segments)
                .sum();
    }
}
