package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrayLength = Integer.parseInt(reader.readLine());
        int[] array = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("длина массива: " + array.length);

        int moreThanEight = 0;
        int one = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] > 8)
                moreThanEight++;
            if (array[i] == 1)
                one++;
            if (array[i] % 2 == 0)
                even++;
            if (array[i] % 2 != 0)
                odd++;
        }

        System.out.println("Количество чисел больше 8: " + moreThanEight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}









