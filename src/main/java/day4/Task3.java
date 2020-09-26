package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[12][8];
        Random random = new Random();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(51);
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < numbers.length; i++) {
            sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum = sum + numbers[i][j];
            }
            System.out.println("sum " + sum);
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(index);
    }
}


