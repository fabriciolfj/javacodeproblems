package com.github.fabriciolfj.javacodeproblems.features.agrupando;

import com.github.fabriciolfj.javacodeproblems.features.model.Melon;
import com.github.fabriciolfj.javacodeproblems.features.model.Melon.Sugar;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SimulandoMultinivel {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 2000, Sugar.HIGHT),
                new Melon("teste", 2000, Sugar.HIGHT),
                new Melon("teste", 2000, Sugar.LOW),
                new Melon("Hemi", 1600, Sugar.UNKNOWN),
                new Melon("Gac", 3000, Sugar.UNKNOWN),
                new Melon("Apollo", 2000, Sugar.UNKNOWN),
                new Melon("Horned", 1700, Sugar.HIGHT));


        //agrupando por nivel de açucar e peso
        Map<Sugar, Map<Integer, Set<String>>> bySugarAndWeight = melons.stream().collect(
                Collectors.groupingBy(Melon::getSugar, Collectors.groupingBy(Melon::getWeight, TreeMap::new,
                        Collectors.mapping(Melon::getType, Collectors.toSet()))));

        System.out.println(bySugarAndWeight);
    }
}
