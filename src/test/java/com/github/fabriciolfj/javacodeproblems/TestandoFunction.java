package com.github.fabriciolfj.javacodeproblems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.stream.Stream;

public class TestandoFunction {

    public static Function<String, String> reduceStrings(Function<String, String>... functions) {
        return Stream.of(functions).reduce(Function.identity(), Function::andThen);
    }

    @Test
    public void testReduceStrings() {
        //Function<Parametro, Retorno>
        Function<String, String> f1 = (String s) -> s.toUpperCase();
        Function<String, String> f2 = (String s) -> s.concat(" DONE");
        Function<String, String> f = reduceStrings(f1, f2);

        Assertions.assertEquals("TEST DONE", f.apply("test"));
    }
}
