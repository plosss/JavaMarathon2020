package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int sum2 = 0;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
            sum = max + numbers[index + 1] + numbers[index + 2];
        }

        for (int i = index; i > 0; i--) {                           // мне кажется этот код не совсем правильно работает. Когда максимальное число массива
            sum2 = max + numbers[index - 1] + numbers[index - 2];   // попадает в 0 элемент, сумма левой тройки выходит 0. Хотя сумма думаю должна быть равна переменной max.
        }

        System.out.println("максимальное число массива: " + max);
        System.out.println("сумма правой тройки: " + sum);
        System.out.println("сумма левой тройки: " + sum2);
        System.out.println("максимальная сумма: " + Math.max(sum, sum2));
        if(sum2 > sum)
            System.out.println(index - 2);
        if(sum2 < sum)
            System.out.println(index);
    }
}
