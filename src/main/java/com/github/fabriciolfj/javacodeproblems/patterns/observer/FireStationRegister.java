package com.github.fabriciolfj.javacodeproblems.patterns.observer;

public interface FireStationRegister {
    void registerFireStation(FireObserver fo);
    void notifyFireStations(String address);
}
