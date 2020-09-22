package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double y;

        if (x >= 5) {
             y = (x * x - 10) / (x + 7);
        } else if (-3 < x && x < 5) {
             y = (x + 3) * (x * x - 2);
        }
        else {
            y = 420 ;
        }
        System.out.println(y);
    }
}
