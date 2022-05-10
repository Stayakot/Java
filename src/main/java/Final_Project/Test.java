package Final_Project;

public class Test {
    public static void main(String[] args) {

        BattleField battleField1 = new BattleField("Player 1");

        battleField1.filledField();
        battleField1.printField();

        BattleField battleField2 = new BattleField("Player2");
        battleField2.filledField();
        battleField2.printField();

        BattleShip battleship = new BattleShip(battleField1, battleField2);
        battleship.play();
    }
}