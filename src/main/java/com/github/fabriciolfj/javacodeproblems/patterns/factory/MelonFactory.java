package com.github.fabriciolfj.javacodeproblems.patterns.factory;

import com.github.fabriciolfj.javacodeproblems.features.model.Cantaloupe;
import com.github.fabriciolfj.javacodeproblems.features.model.Fruit;
import com.github.fabriciolfj.javacodeproblems.features.model.Gac;
import com.github.fabriciolfj.javacodeproblems.features.model.Hemi;
import com.github.fabriciolfj.javacodeproblems.features.model.Melon;

import java.util.Map;
import java.util.function.Supplier;

public class MelonFactory {

    private static final Map<String, Supplier<Fruit>> MELONS = Map.of("Gac", Gac::new, "Hemi", Hemi::new, "Cantaloupe", Cantaloupe::new);
    private static final TriFunction<String, Integer, String, Melon> MELON = Melon::new;

    public static Fruit newInstance(Class<?> clazz) {
        Supplier<Fruit> supplier = MELONS.get(clazz.getSimpleName());

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid clazz argument: " + clazz);
        }

        return supplier.get();
    }

    public static Fruit newInstance(String name, int weight, String color) {
        return MELON.apply(name, weight, color);
    }
}
