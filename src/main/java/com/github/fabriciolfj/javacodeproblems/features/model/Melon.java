package com.github.fabriciolfj.javacodeproblems.features.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Melon implements Fruit {

    public enum Sugar {
        LOW, MEDIUM, HIGHT, UNKNOWN
    }

    private final String type;
    private final int weight;
    private final String origin;
    private final Sugar sugar;
    private final List<String> bugs;

    public Melon(String type, List<String> bugs) {
        this.type = type;
        this.origin = "test";
        this.sugar = Sugar.UNKNOWN;
        this.weight = 100;
        this.bugs = bugs;
    }

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
        this.origin = "test";
        this.sugar = Sugar.UNKNOWN;
        this.bugs = Collections.emptyList();
    }

    public Melon(String type, int weight, Sugar sugar) {
        this.type = type;
        this.weight = weight;
        this.origin = "test";
        this.sugar = sugar;
        this.bugs = Collections.emptyList();
    }

    public Melon(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
        this.sugar = Sugar.UNKNOWN;
        this.bugs = Collections.emptyList();
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigin() {
        return origin;
    }

    public Sugar getSugar() {
        return sugar;
    }

    public List<String> getBugs() {
        return bugs;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melon melon = (Melon) o;
        return weight == melon.weight &&
                Objects.equals(type, melon.type) &&
                Objects.equals(origin, melon.origin) &&
                sugar == melon.sugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, weight, origin, sugar);
    }
}
