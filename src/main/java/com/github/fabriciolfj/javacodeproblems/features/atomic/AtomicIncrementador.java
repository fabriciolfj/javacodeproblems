package com.github.fabriciolfj.javacodeproblems.features.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIncrementador implements Runnable {

    public static AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}
