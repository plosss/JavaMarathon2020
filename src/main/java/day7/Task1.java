package day7;


public class Task1 {
    public static void main(String[] args) {
        Airplane a = new Airplane("AirAstana",2015,25,30000);
        Airplane b = new Airplane("Scat",2013,20,20000);

        Airplane.compareAirplanes(a,b);

    }
}