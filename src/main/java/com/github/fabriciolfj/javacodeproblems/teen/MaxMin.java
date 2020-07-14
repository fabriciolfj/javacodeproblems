package com.github.fabriciolfj.javacodeproblems.teen;

public class MaxMin {

    private final Integer min;
    private final Integer max;

    public MaxMin(final Integer min, final Integer max) {
        this.min = min;
        this.max = max;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "MaxMin{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
