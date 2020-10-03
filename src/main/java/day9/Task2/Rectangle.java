package day9.Task2;

import day9.Figure;

public class Rectangle extends Figure {

    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double area() {             //при переопределении метода разве сигнатура не должна совпадать?
        return width * height;         //типа public abstract double area(){};
    }

    public double perimeter() {
        return (width + height) * 2;
    }
}
