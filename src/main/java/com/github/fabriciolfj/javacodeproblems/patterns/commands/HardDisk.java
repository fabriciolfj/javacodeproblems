package com.github.fabriciolfj.javacodeproblems.patterns.commands;

public class HardDisk implements IODevice {
    @Override
    public void copy() {
        System.out.println("Copiando...");
    }

    @Override
    public void delete() {
        System.out.println("Deletando...");
    }

    @Override
    public void move() {
        System.out.println("Movendo...");
    }
}
