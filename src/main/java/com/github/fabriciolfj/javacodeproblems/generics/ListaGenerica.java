package com.github.fabriciolfj.javacodeproblems.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListaGenerica<T> {

    public <S extends T> List<T> fromList(T[] a){
        return Stream.of(a).collect(Collectors.toList());
    }

    public <S extends Integer> List<T> fromListNumber(T[] a){
        return Stream.of(a).collect(Collectors.toList());
    }
}
