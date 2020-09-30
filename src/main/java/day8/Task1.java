package day8;

public class Task1 {
    public static void main(String[] args) {
        String s = "";

        long st = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            s = i + " ";
        }

        long ft = System.currentTimeMillis();

        System.out.println("время обработки через String: " + (ft - st));

        StringBuilder s1 = new StringBuilder();

        long st2 = System.currentTimeMillis();

        for (int i = 0; i < 20001; i++) {
            s1.append(i).append(" ");
        }

        long ft2 = System.currentTimeMillis();

        System.out.println("время обработки через StringBuilder: " + (ft2 - st2));
    }
}


