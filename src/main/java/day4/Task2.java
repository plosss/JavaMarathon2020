package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] numbers = new int[15];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1001);
        }

        for (int n : numbers) {
            if (n > max)
                max = n;
            else if (n < min)
                min = n;
            else if (n % 10 == 0) { // когда в массиве встречается одна цифра заканчивающаяся
                count++;            // на 0, то счетчик count и sum выводит корректно, но если
                sum = sum + n;      // более одной то результат выходит ошибочный. Подскажите пжл в чем дело
            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sum);
    }
}
