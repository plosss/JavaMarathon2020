package day7;

/*
1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет создать статический метод compareAirplanes, который в качестве аргументов
принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Airplane a = new Airplane("AirAstana",2015,25,30000);
        Airplane b = new Airplane("Scat",2013,20,20000);

        Airplane.compareAirplanes(a,b);
    }
}