package com.github.fabriciolfj.javacodeproblems.features.metodopadraoInterfaces;

public class Square implements Polygon {

    private final double edge;

    public Square(final double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return Math.pow(perimeter(edge, edge, edge, edge) /4,2);
    }

    public static void main(String[] args) {
        var square = new Square(6);
        System.out.println(square.area());
    }
}
