package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int floorNumber = Integer.parseInt(reader.readLine());

        if (floorNumber >= 1 && floorNumber <= 4)
            System.out.println("Малоэтажный дом");
        else if (floorNumber >= 5 && floorNumber <= 8)
            System.out.println("Среднеэтажный дом");
        else if (floorNumber >= 9)
            System.out.println("Многоэтажный дом");
        else
            System.out.println("Ошибка ввода");
    }
}
