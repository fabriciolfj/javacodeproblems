package com.github.fabriciolfj.javacodeproblems.model;

import java.util.Objects;

public class Melon implements Fruit {

    public enum Sugar {
        LOW, MEDIUM, HIGHT, UNKNOWN
    }

    private final String type;
    private final int weight;
    private final String origin;
    private final Sugar sugar;

    public Melon(String type, int weight) {
        this.type = type;
        this.weight = weight;
        this.origin = "test";
        this.sugar = Sugar.UNKNOWN;
    }

    public Melon(String type, int weight, Sugar sugar) {
        this.type = type;
        this.weight = weight;
        this.origin = "test";
        this.sugar = sugar;
    }

    public Melon(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
        this.sugar = Sugar.UNKNOWN;
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
