package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a > b || a == b)
            System.out.println("Некорректный ввод");

        while (a < b) {
            if(a % 5 == 0 && a % 10 != 0)
            System.out.println(a);
            a++;
        }
    }
}

