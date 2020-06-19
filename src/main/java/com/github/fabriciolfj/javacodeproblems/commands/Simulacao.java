package com.github.fabriciolfj.javacodeproblems.commands;

public class Simulacao {

    public static void main(String[] args) {
        HardDisk hd = new HardDisk();
        Sequence sequence = new Sequence();
        sequence.recordSequence(hd::copy);
        sequence.recordSequence(hd::move);
        sequence.recordSequence(hd::delete);
        sequence.runSequence();
    }
}
