package com.github.fabriciolfj.javacodeproblems.patterns.observer;

public class Simulacao {

    public static void main(String[] args) {
        FireStation station = new FireStation();
        station.registerFireStation((String address) -> System.out.println("Station1 " + address));
        station.registerFireStation((String address) -> System.out.println("Station2 " + address));

        station.notifyFireStations("Rua Anterno barbosa");
    }
}
