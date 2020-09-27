package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("AirAstana",2015,25,30);
        airplane.setYear(2017);
        airplane.setLength(20);
        airplane.fillUp(100);
        airplane.fillUp(150);
        airplane.info();
    }
}
