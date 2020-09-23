package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        while (i < 5) {
            double a = Double.parseDouble(reader.readLine());
            double b = Double.parseDouble(reader.readLine());
            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }
            System.out.println(a / b);
            i++;
        }
    }
}

