package com.github.fabriciolfj.javacodeproblems.features.streamofnullable;

import java.util.Collection;
import java.util.stream.Stream;

public class Test<T> {

    public static <T> Stream<T> collectionAsStream(Collection<T> collection) {
        return Stream.ofNullable(collection)
                .flatMap(Collection::stream)
                .flatMap(Stream::ofNullable);
    }
}
