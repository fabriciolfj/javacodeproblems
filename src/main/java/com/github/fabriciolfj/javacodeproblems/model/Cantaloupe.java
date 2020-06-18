package com.github.fabriciolfj.javacodeproblems.model;

public class Cantaloupe implements Fruit {

    private String type;
    private int weight;
    private String origin;

    public Cantaloupe() {

    }

    public Cantaloupe(String type, int weight, String origin) {
        this.type = type;
        this.weight = weight;
        this.origin = origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }
}
