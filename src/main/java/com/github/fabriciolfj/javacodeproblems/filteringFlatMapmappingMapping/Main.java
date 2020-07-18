package com.github.fabriciolfj.javacodeproblems.filteringFlatMapmappingMapping;

import com.github.fabriciolfj.javacodeproblems.model.Melon;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Crenshaw", 2000),
                new Melon("Hemi", 1600),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2000),
                new Melon("Crenshaw", 1700),
                new Melon("Gac", 3000),
                new Melon("Hemi", 2600)
        );

        pegandoOsMelonsAcimaDe2000EAgrupandoPorTipo(melons);
        queroAgrouparMelonsAcimaDe2000PorTipoHemi(melons);
        paraCadaTipoDeMelonQueroAListaDePesosEmOrdemAscendente(melons);
        queroUmaListaDeMelonsAbaixoDe2000EacimaDe2000(melons);
    }

    private static void queroUmaListaDeMelonsAbaixoDe2000EacimaDe2000(List<Melon> melons) {
        Map<Boolean, Set<String>> melonsMapping = melons.stream()
                .collect(Collectors.partitioningBy(m -> m.getWeight() >  2000, Collectors.mapping(Melon::getType, Collectors.toSet())));
        System.out.println(melonsMapping);
    }

    private static void paraCadaTipoDeMelonQueroAListaDePesosEmOrdemAscendente(List<Melon> melons) {
        Map<String, TreeSet<Integer>> melonsMapping = melons.stream()
                .collect(Collectors.groupingBy(Melon::getType,
                        Collectors.mapping(Melon::getWeight, Collectors.toCollection(TreeSet::new)))); //mapea em um novo tipo de lista
        System.out.println(melonsMapping);
    }

    private static void queroAgrouparMelonsAcimaDe2000PorTipoHemi(List<Melon> melons) {
        //vai gerar 2 listas, uma que atende o predicate e outra que não
        Map<Boolean, Set<Melon>> melonsFiltering = melons.stream()
                .collect(Collectors.partitioningBy(m -> m.getWeight() > 2000,
                        Collectors.filtering(m -> m.getType().equals("Hemi"), Collectors.toSet())));
        System.out.println(melonsFiltering);

        //aplicando o filtro
        Map<Boolean, Set<Melon>> melonsFiltering2 = melons.stream()
                .filter(m -> m.getType().equals("Hemi"))
                .collect(Collectors.partitioningBy(m -> m.getWeight() > 2000, Collectors.toSet()));
        System.out.println(melonsFiltering2);
    }

    private static void pegandoOsMelonsAcimaDe2000EAgrupandoPorTipo(List<Melon> melons) {
        Map<String, Set<Melon>> list = melons.stream().collect(Collectors.groupingBy(Melon::getType,
                Collectors.filtering(m -> m.getWeight() > 2000, Collectors.toSet())));
        System.out.println(list);

        //o filtro não executa mapeamentos naqueles que falhando no predicate, assim o resultado muda um pouco,
        Map<String, Set<Melon>> list2 = melons.stream().filter(m -> m.getWeight() > 2000)
                .collect(Collectors.groupingBy(Melon::getType, Collectors.toSet()));
        System.out.println(list2);
    }
}
