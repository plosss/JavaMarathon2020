package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        for (int i = a; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0)
                System.out.println(i);
        }
        if (a > b || a == b)
            System.out.println("Некорректный ввод");
    }
}
