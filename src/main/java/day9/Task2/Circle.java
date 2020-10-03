package day9.Task2;

import day9.Figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double area(){
        return 3.14 * (radius * radius);
    }

    public double perimeter(){
        return 2 * 3.14 * radius;
    }

}
