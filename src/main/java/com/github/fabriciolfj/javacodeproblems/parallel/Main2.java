package com.github.fabriciolfj.javacodeproblems.parallel;

import java.util.List;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main2 {

    /*
    * paralell 769ms
    * */
    public static void main(String[] args) {
        var persons = List.of(
                new Person("Fabricio", "Rua Bahia"),
                new Person("Suzana", "Rua Acre"),
                new Person("Roberto", "Rua Bahia"),
                new Person("Carlos", "Rua Amazonas"),
                new Person("Debora", "Rua Bahia"),
                new Person("Suelem", "Rua Acre"));

        var groupAddress = persons.parallelStream().collect(groupingBy(Person::getAddress, counting()));

        System.out.println(groupAddress);
    }
}
