package com.github.fabriciolfj.javacodeproblems.partitioningBy;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Simulacao {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000),
                new Melon("teste", 2000),
                new Melon("teste", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Apollo", 2000),
                new Melon("Horned", 1700));

        //uma forma de agrupamento, onde divide confirme a condição do predicate passado.
        Map<Boolean, List<Melon>> byWeight = melons.stream()
                .collect(Collectors.partitioningBy(m -> m.getWeight() > 2000));

        System.out.println(byWeight);

        // eliminando duplicidades
        Map<Boolean, Set<Melon>> byWeigthSemDuplicidade = melons.stream()
                .collect(Collectors.partitioningBy(m -> m.getWeight() > 2000, Collectors.toSet()));
        System.out.println(byWeigthSemDuplicidade);

        //contar o numero que atendeu e não atendeu a condição
        Map<Boolean, Long> byWeightAndCount = melons.stream()
                .distinct()// caso queira tirar a duplicidade
                .collect(Collectors.partitioningBy(m -> m.getWeight() >= 2000, Collectors.counting()));

        System.out.println(byWeightAndCount);

        //agruando aqueles que atenderem a condição e depois agrupar (mostrar) os maiores
        Map<Boolean, Melon> byWeighMax = melons.stream()
                .collect(Collectors.partitioningBy(
                        m  -> m.getWeight() >= 2000, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(Melon::getWeight)), Optional::get
                )));

        System.out.println(byWeighMax);
    }
}
