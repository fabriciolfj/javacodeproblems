package com.github.fabriciolfj.javacodeproblems.patterns.executearound;

import java.io.IOException;
import java.util.Scanner;

@FunctionalInterface
public interface ScannerDoubleFunction {

    double readDouble(Scanner scanner) throws IOException;
}
