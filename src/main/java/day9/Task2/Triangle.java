package day9.Task2;

import day9.Figure;

public class Triangle extends Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double pp = (a + b + c) / 2;
        double a1 = pp - a;
        double a2 = pp - b;
        double a3 = pp - c;
        return Math.sqrt(pp * a1 * a2 * a3);
    }

    public double perimeter() {
        return a + b + c;
    }
}
