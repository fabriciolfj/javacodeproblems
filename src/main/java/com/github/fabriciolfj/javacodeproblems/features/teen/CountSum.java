package com.github.fabriciolfj.javacodeproblems.features.teen;

public class CountSum {

    private final Long count;
    private final Integer sum;

    public CountSum(Long count, Integer sum) {
        this.count = count;
        this.sum = sum;
    }

    public Long getCount() {
        return count;
    }

    public Integer getSum() {
        return sum;
    }

    @Override
    public String toString() {
        return "CountSum{" +
                "count=" + count +
                ", sum=" + sum +
                '}';
    }
}
