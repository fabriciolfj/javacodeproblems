package com.github.fabriciolfj.javacodeproblems.features.generics;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListaGenerica<Pessoa> lista = new ListaGenerica<>();
        Pessoa[] array = {new Pessoa("Fabricio"), new Pessoa("Suzana")};
        List<Pessoa> pessoas = lista.fromListNumber(array);
        pessoas.forEach(p -> System.out.println(p));


    }
}
