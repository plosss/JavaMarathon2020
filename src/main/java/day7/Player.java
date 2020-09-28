package day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 100;
    public static int MIN_STAMINA = 0;
    public static int countPlayers = 0;


    public Player() {
        Random random = new Random();
        stamina = random.nextInt(11) + 90;
        if (countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        stamina--;
        if (stamina > 0)
            System.out.println("игрок бежит");
        if (stamina == 0) {
            System.out.println("игроку нужен отдых");
            System.out.println("количество игроков на поле: " + --countPlayers);
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int freePlace = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + freePlace + " свободных мест");
        } else
            System.out.println("На поле нет свободных мест");
    }
}




