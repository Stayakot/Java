package day7;

public class Player {
   public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers>6){
            countPlayers--;
        }
    }


    int stamina = 10;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayers = 0;


    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        stamina--;
        if (stamina > 0) {
            System.out.println("Игрок побежал, выносливости осталось: " + stamina);
        } else if (stamina == 0) {
            System.out.println("Игрок устал: " + stamina);
            countPlayers--;
            System.out.println("Игроков осталось: " + countPlayers);
        } else if (stamina <= 0) {
            stamina++;
            System.out.println("Игрок устал: " + stamina);
        }
    }

    public static void info() {
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers < 5 && countPlayers > 1) {
            int ColichestvoNaPole = 6 - countPlayers;
            System.out.println("Команды неполные. На поле еще есть " + ColichestvoNaPole + " свободных мест");
        } else if (countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        }

    }
}
