package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("red");
        car1.setModel("Ferrari");
        car1.setYear(2011);

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}
