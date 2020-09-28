package day7;


public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        Player p7 = new Player();

        System.out.println("Количство игроков на поле: "+ Player.countPlayers);
        System.out.println("выносливость первого игрока " + p1.getStamina());
        Player.info();
        for (int i = Player.MAX_STAMINA; i > Player.MIN_STAMINA ; i--) {
            p1.run();
        }

    }
}
