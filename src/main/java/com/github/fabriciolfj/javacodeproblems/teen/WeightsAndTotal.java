package com.github.fabriciolfj.javacodeproblems.teen;

import java.util.List;

public class WeightsAndTotal {

    private final int totalWeight;
    private final List<Integer> weights;

    public WeightsAndTotal(int totalWeight, List<Integer> weights) {
        this.totalWeight = totalWeight;
        this.weights = weights;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public List<Integer> getWeights() {
        return weights;
    }

    @Override
    public String toString() {
        return "WeightsAndTotal{" +
                "totalWeight=" + totalWeight +
                ", weights=" + weights +
                '}';
    }
}
