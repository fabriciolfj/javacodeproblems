package com.github.fabriciolfj.javacodeproblems.patterns.executearound;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
* Padrão e indicado para evitar código boilerplate, no caso para abertura e fechamdo de recursos na leitura dos arquivos
* */
public class Simulacao {

    public static void main(String[] args) throws IOException {
        double singleDouble = read((Scanner sc) -> getFirst(sc));
        double sumAllDouble = read((Scanner sc) -> sumAll(sc));

        System.out.println(singleDouble);
        System.out.println(sumAllDouble);
    }

    private static double read(ScannerDoubleFunction snf) throws IOException {
        try (Scanner scanner = new Scanner(
                Path.of("doubles.txt"), StandardCharsets.UTF_8)) {
            return  snf.readDouble(scanner);
        }
    }

    private static double getFirst(Scanner scanner) {
        if(scanner.hasNext()) {
            return scanner.nextInt();
        }

        return Double.NaN;
    }

    private static double sumAll(Scanner scanner) {
        double sum = 0.0d;
        while(scanner.hasNextDouble()) {
            sum += scanner.nextDouble();
        }

        return sum;
    }
}
