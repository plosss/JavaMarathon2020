package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2013);
        MotoBike motoBike = new MotoBike(2010, "black", "suzuki");

        car.info();
        motoBike.info();

        System.out.println(car.yearDifference(2000));
        System.out.println(motoBike.yearDifference(2020));

    }
}
