package day9.Task2;

import day9.Figure;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {new Triangle("red", 10, 10, 10),
                new Triangle("green", 10, 20, 30),
                new Triangle("green", 10, 20, 30),
                new Rectangle("red", 5, 10),
                new Rectangle("orange", 40, 15),
                new Circle("red", 4),
                new Circle("red", 10),
                new Circle("blue", 5),
        };


        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }


    public static double calculateRedPerimeter(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("red"))
                sum = sum + figures[i].perimeter();
        }
        return sum;
    }


    public static double calculateRedArea(Figure[] figures) {
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("red"))
                sum += figures[i].area();
        }
        return sum;
    }
}



