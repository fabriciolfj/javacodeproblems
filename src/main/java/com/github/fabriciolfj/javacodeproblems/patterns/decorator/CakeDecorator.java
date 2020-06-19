package com.github.fabriciolfj.javacodeproblems.patterns.decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class CakeDecorator {

    private Function<Cake, Cake> decorator;

    public CakeDecorator(Function<Cake, Cake>... decorations) {
        reduceDecorations(decorations);
    }

    private void reduceDecorations(Function<Cake, Cake>... decorations) {
        decorator = Stream.of(decorations).reduce(f -> f, (x,g) -> g.andThen(g)); //Function.identity(), Function::andThe
    }

    public Cake decorate(Cake cake) {
        return decorator.apply(cake);
    }
}
